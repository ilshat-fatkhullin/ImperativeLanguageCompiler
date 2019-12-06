package main.main;

import i_grammar.ILexer;
import i_grammar.IParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ParserVisitor;
import parser.Preprocessor;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("input");

        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        String line = buf.readLine();
        ArrayList<String> code = new ArrayList<>();
        while (line != null) {
            code.add(line);
            line = buf.readLine();
        }
        Preprocessor preprocessor = new Preprocessor();
        String preprocessed = preprocessor.preprocess(code);

        BufferedWriter writer = new BufferedWriter(new FileWriter("inputPreprocessed"));
        writer.write(preprocessed);
        writer.close();

        CharStream stream = CharStreams.fromFileName("inputPreprocessed");

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

        writer = new BufferedWriter(new FileWriter("output.il"));
        writer.write(result);
        writer.close();
    }

}