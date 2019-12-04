package parser;

import i_grammar.IBaseVisitor;
import i_grammar.IParser;

public class ParserVisitor extends IBaseVisitor<String> {

    @Override
    public String visitProgram(IParser.ProgramContext ctx) {
        return "program \n" + visitChildren(ctx);
    }

    @Override
    public String visitRoutine_declaration(IParser.Routine_declarationContext ctx) {
        return "routine \n" + visitChildren(ctx);
    }
}
