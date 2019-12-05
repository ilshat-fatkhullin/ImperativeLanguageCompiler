package parser;

import i_grammar.IBaseVisitor;
import i_grammar.IParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class ParserVisitor extends IBaseVisitor<String> {
    private int targetIterator = 0;

    private Hashtable<String, Integer> parameterToNumber = new Hashtable<>();

    private Stack<Hashtable<String, Integer>> variableToNumberStack = new Stack<>();

    private ArrayList<String> variableInitializations = new ArrayList<>();

    private Hashtable<String, String> identifierToRoutineCall = new Hashtable<>();

    private String getNextTarget() {
        targetIterator++;
        return String.format("IL_%04d", targetIterator);
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
            System.out.println(String.format("(getVariableNumber) error: %s is not defined.", identifier));
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
            String childResult = node.getChild(i).accept(this);
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
        targetIterator = 0;

        String int32Printer = "\n.method public static void print_int(int32 a) cil managed \n" +
                "{\n" +
                "ldarg.0\n" +
                "call void [mscorlib]System.Console::WriteLine(int32)\n" +
                "ret\n" +
                "}\n";

        String realPrinter = "\n.method public static void print_real(float32 a) cil managed \n" +
                "{\n" +
                "ldarg.0\n" +
                "call void [mscorlib]System.Console::WriteLine(float32)\n" +
                "ret\n" +
                "}\n";

        identifierToRoutineCall.put("print_int", "void print_int(int32)");
        identifierToRoutineCall.put("print_real", "void print_real(float32)");

        return String.format(".assembly example{}" +
                int32Printer +
                realPrinter +
                "%s", visitChildren(ctx));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitSimple_declaration(IParser.Simple_declarationContext ctx) {
        variableInitializations = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            result.append(ctx.getChild(i).accept(this));
            if (i < ctx.getChildCount() - 1) {
                result.append(",\n");
            }
        }

        StringBuilder initializations = new StringBuilder();
        for (String initialization : variableInitializations) {
            initializations.append(initialization);
        }

        return String.format(".locals init (\n%s\n)\n%s", result, initializations.toString());
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
        if (ctx.getChildCount() == 6) {
            String initialization = String.format("%sstloc.%d\n",
                    ctx.getChild(5).accept(this),
                    number);
            variableInitializations.add(initialization);
        }
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

        String type = ctx.getChild(4).accept(this);
        String identifier = ctx.getChild(1).getText();
        String parameters = ctx.getChild(2).accept(this);
        String entrypoint = "";

        if (identifier.equals("main")) {
            entrypoint = ".entrypoint\n";
        }

        if (ctx.getChildCount() == 6) {
            type = "void";
        }

        String callParameters = parameters.replace(',', ' ');
        String[] parts = callParameters.split(" ");
        StringBuilder formattedCallParameters = new StringBuilder();
        for (int i = 0; i < parts.length; i += 2) {
            formattedCallParameters.append(parts[i]);
            formattedCallParameters.append(' ');
        }

        identifierToRoutineCall.put(identifier, String.format("%s %s(%s)", type, identifier, formattedCallParameters.toString().trim()));

        String body = ctx.getChild(ctx.getChildCount() - 2).accept(this);

        return String.format(".method public static %s %s(%s) cil managed\n{\n%s%sret\n}\n",
                type,
                identifier,
                parameters,
                entrypoint,
                body);
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
    public String visitReturn_statement(IParser.Return_statementContext ctx) {
        String identifier = ctx.getChild(1).getText();

        for (Hashtable<String, Integer> h : variableToNumberStack) {
            if (h.containsKey(identifier)) {
                return String.format("ldloc.%d\n", h.get(identifier));
            }
        }
        if (parameterToNumber.containsKey(identifier)) {
            return String.format("ldarg %d\n", parameterToNumber.get(identifier));
        } else {
            System.out.println(String.format("(return statement) error: %s is not defined.", identifier));
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
    public String visitAssignment(IParser.AssignmentContext ctx) {
        String identifier = ctx.getChild(0).accept(this);
        for (Hashtable<String, Integer> h : variableToNumberStack) {
            if (h.containsKey(identifier)) {
                return String.format("%sstloc.%d\n",
                        ctx.getChild(2).accept(this),
                        h.get(identifier));
            }
        }
        if (parameterToNumber.containsKey(identifier)) {
            return String.format("%sstarg %d\n",
                    ctx.getChild(2).accept(this),
                    parameterToNumber.get(identifier));
        } else {
            System.out.println(String.format("(assignment) error: %s is not defined.", identifier));
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
        String identifier = ctx.getChild(0).getText();
        if (!identifierToRoutineCall.containsKey(identifier)) {
            System.out.println(String.format("(routine call) error: %s is not defined.", identifier));
            return "null";
        }

        String routineCall = identifierToRoutineCall.get(identifier);

        if (ctx.getChildCount() == 3) {
            return String.format("call %s\n", routineCall);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < ctx.getChildCount(); i += 2) {
            String expression = ctx.getChild(i).accept(this);
            result.append(expression);
        }

        result.append(String.format("call %s\n", routineCall));
        return result.toString();
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
        String expression = ctx.getChild(1).accept(this);
        String equalTarget = getNextTarget();
        String exitTarget = getNextTarget();
        String ifBody = ctx.getChild(3).accept(this);
        if (ctx.getChildCount() == 7) {
            return String.format("%sldc.i4.0\nbeq %s\n%sbr %s\n%s:\n%s%s:\n",
                    expression,
                    equalTarget,
                    ctx.getChild(5).accept(this),
                    exitTarget,
                    equalTarget,
                    ifBody,
                    exitTarget);
        } else {
            return String.format("%sldc.i4.0\nbeq %s\nbr %s\n%s:\n%s%s:\n",
                    expression,
                    equalTarget,
                    exitTarget,
                    equalTarget,
                    ifBody,
                    exitTarget);
        }
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
                System.out.println("(expression) error when parsing op code.");
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
                System.out.println("(relation) error when parsing op code.");
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
            System.out.println(String.format("(primary) error: %s is not defined.", identifier));
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
