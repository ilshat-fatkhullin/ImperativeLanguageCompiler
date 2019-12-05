package main.main;

import i_grammar.ILexer;
import i_grammar.IParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ParserVisitor;

import java.io.File;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        CharStream stream = CharStreams.fromFileName("test");

        ILexer lexer = new ILexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        IParser parser = new IParser(tokens);

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener.INSTANCE);

        ParseTree tree = null;
        try {
            tree = parser.program();
        } catch (ParseCancellationException e) {
            System.out.println(e.getMessage());
        }

        String s = JsonCreater.toJson(tree);
        PrintWriter pw = new PrintWriter(new File("ast.json"));
        pw.write(s);
        pw.close();

        ParserVisitor extractor = new ParserVisitor();
        String result = extractor.visit(tree);
        System.out.println(result);
    }

}