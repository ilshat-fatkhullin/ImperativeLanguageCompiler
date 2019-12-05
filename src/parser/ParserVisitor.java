package parser;

import i_grammar.IBaseVisitor;
import i_grammar.IParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Queue;
import java.util.Stack;

public class ParserVisitor extends IBaseVisitor<String> {
    private int iterator = 0;

    private Hashtable<String, Integer> parameterToNumber = new Hashtable<>();

    private Stack<Hashtable<String, Integer>> variableToNumberStack = new Stack<>();

    private ArrayList<String> variableInitializations = new ArrayList<>();

    public String getNextTarget() {
        iterator++;
        return String.format("target_%d", iterator);
    }

    public Integer getVariableNumber(String identifier) {
        for (Hashtable<String, Integer> h : variableToNumberStack) {
            if (h.containsKey(identifier)) {
                return h.get(identifier);
            }
        }

        if (parameterToNumber.containsKey(identifier)) {
            return parameterToNumber.get(identifier);
        } else {
            System.out.println(String.format("Error: %s is not defined.", identifier));
            return 0;
        }
    }

    public String getExpressionType(ParseTree expression) {
        ParseTree relation = expression.getChild(0);
        if (relation.getChildCount() >= 2) {
            return "bool";
        }
        return relation.getChild(0).getChild(0).getChild(0).getChild(0).getText();
    }

    @Override
    public String visitChildren(RuleNode node) {
        String result = "";
        int n = node.getChildCount();

        for (int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            String childResult = c.accept(this);
            result += childResult;
        }

        return result;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitProgram(IParser.ProgramContext ctx) {
        return String.format(".assembly example{}\n%s", visitChildren(ctx));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitSimple_declaration(IParser.Simple_declarationContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            result.append(ctx.getChild(i).accept(this));
            if (i < ctx.getChildCount() - 1) {
                result.append(",\n");
            }
        }
        return String.format(".locals init (\n%s\n)\n", result);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitVariable_declaration(IParser.Variable_declarationContext ctx) {
        Integer number = variableToNumberStack.peek().size();
        String identifier = ctx.getChild(1).getText();
        variableToNumberStack.peek().put(identifier, number);
        return String.format("[%d] %s %s", number, ctx.getChild(3).accept(this), identifier);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitType_declaration(IParser.Type_declarationContext ctx) {
        return "type_declaration " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitRoutine_declaration(IParser.Routine_declarationContext ctx) {
        parameterToNumber = new Hashtable<>();

        switch (ctx.getChild(1).toString()) {
            case "main":
                return String.format(".method public static %s %s(%s) cil managed\n{\n.entrypoint\n%sret\n}\n",
                        ctx.getChild(4).accept(this),
                        ctx.getChild(1),
                        ctx.getChild(2).accept(this),
                        ctx.getChild(6).accept(this));
            default:
                return String.format(".method public static %s %s(%s) cil managed\n{\n%sret\n}\n",
                        ctx.getChild(4).accept(this),
                        ctx.getChild(1),
                        ctx.getChild(2).accept(this),
                        ctx.getChild(6).accept(this));
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitParameters(IParser.ParametersContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < ctx.getChildCount() - 1; i++) {
            result.append(ctx.getChild(i).accept(this));
            if (i != ctx.getChildCount() - 2) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitParameter_declaration(IParser.Parameter_declarationContext ctx) {
        String identifier = ctx.getChild(0).getText();
        String type = ctx.getChild(2).accept(this);
        parameterToNumber.put(identifier, parameterToNumber.size());
        return String.format("%s %s", type, identifier);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitType(IParser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitPrimitive_type(IParser.Primitive_typeContext ctx) {
        switch (ctx.getText()) {
            case "integer":
                return "int32";
            case "boolean":
                return "bool";
            case "real":
                return "float32";
        }
        return ctx.getText();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitRecord_type(IParser.Record_typeContext ctx) {
        return "record_type " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitArray_type(IParser.Array_typeContext ctx) {
        return "array_type " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitBody(IParser.BodyContext ctx) {
        variableToNumberStack.push(new Hashtable<>());
        String result = visitChildren(ctx);
        variableToNumberStack.pop();
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitStatement(IParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitAssignment(IParser.AssignmentContext ctx) {
        String identifier = ctx.getChild(0).accept(this);
        for (Hashtable<String, Integer> h : variableToNumberStack) {
            if (h.containsKey(identifier)) {
                return String.format("%sstloc.%d\n",
                        ctx.getChild(2).accept(this),
                        h.get(ctx.getChild(0).accept(this)));
            }
        }
        if (parameterToNumber.containsKey(identifier)) {
            return String.format("%sstarg %d\n",
                    ctx.getChild(2).accept(this),
                    parameterToNumber.get(ctx.getChild(0).accept(this)));
        } else {
            System.out.println(String.format("Error: %s is not defined.", identifier));
            return "null";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitRoutine_call(IParser.Routine_callContext ctx) {
        return "call " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitWhile_loop(IParser.While_loopContext ctx) {
        return "while_loop " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitFor_loop(IParser.For_loopContext ctx) {
        return "for_loop " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitRange(IParser.RangeContext ctx) {
        return "range " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitForeach_loop(IParser.Foreach_loopContext ctx) {
        return "foreach_loop " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitIf_statement(IParser.If_statementContext ctx) {
        return "if_statement " + visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitExpression(IParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        String op;
        switch (ctx.getChild(1).getText()) {
            case "and":
                op = "and";
                break;
            case "or":
                op = "or";
                break;
            case "xor":
                op = "xor";
                break;
            default:
                System.out.println("Error when parsing op code.");
                return "";
        }
        return String.format("%s%s%s\n",
                ctx.getChild(0).accept(this),
                ctx.getChild(2).accept(this),
                op);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitRelation(IParser.RelationContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        String op;
        switch (ctx.getChild(1).getText()) {
            case "<":
                op = "clt";
                break;
            case "<=":
                op = "ble";
                break;
            case ">":
                op = "cgt";
                break;
            case ">=":
                op = "bge";
                break;
            case "=":
                op = "ceq";
                break;
            default:
                System.out.println("Error when parsing op code.");
                return "";
        }
        return String.format("%s%s%s\n",
                ctx.getChild(0).accept(this),
                ctx.getChild(2).accept(this),
                op);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitSimple(IParser.SimpleContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        String op;
        switch (ctx.getChild(1).getText()) {
            case "*":
                op = "mul";
                break;
            case "/":
                op = "div";
                break;
            default:
                System.out.println("Error when parsing op code.");
                return "";
        }
        return String.format("%s%s%s\n",
                ctx.getChild(0).accept(this),
                ctx.getChild(2).accept(this),
                op);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitFactor(IParser.FactorContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        }
        String op;
        switch (ctx.getChild(1).getText()) {
            case "+":
                op = "add";
                break;
            case "-":
                op = "sub";
                break;
            default:
                System.out.println("Error when parsing op code.");
                return "";
        }
        return String.format("%s%s%s\n",
                ctx.getChild(0).accept(this),
                ctx.getChild(2).accept(this),
                op);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitSummand(IParser.SummandContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitPrimary(IParser.PrimaryContext ctx) {
        if (ctx.getChild(0).getChildCount() == 0) {
            return String.format("ldc.i4 %s\n", ctx.getChild(0).getText());
        }
        String identifier = visitChildren(ctx);

        for (Hashtable<String, Integer> h : variableToNumberStack) {
            if (h.containsKey(identifier)) {
                return String.format("ldloc.%d\n", h.get(visitChildren(ctx)));
            }
        }

        if (parameterToNumber.containsKey(identifier)) {
            return String.format("ldarg.%d\n", parameterToNumber.get(visitChildren(ctx)));
        } else {
            System.out.println(String.format("Error, %s is not defined.", identifier));
            return "null";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitModifiable_primary(IParser.Modifiable_primaryContext ctx) {
        return ctx.getText();
    }
}
