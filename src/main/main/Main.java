package main.main;

import i_grammar.ILexer;
import i_grammar.IParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

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

//        ScopeChecker sc = new ScopeChecker();
//
//        sc.check(tree);
//        Parser p = new Parser(tree);
//
//        Body b = null;
//
//        try {
//            b = p.parse();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            b.execute(new Scope(null));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}