package parser;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Preprocessor {
    public String preprocess(ArrayList<String> input) {
        StringBuilder result = new StringBuilder();
        for (String line : input) {
            if (line.contains("for ")) {
                result.append(changedFor(line));
            } else {
                result.append(line);
            }
            result.append('\n');
        }
        return result.toString();
    }

    private String changedFor(String input) {
        String[] parts = input.split(" ");
        String range = parts[parts.length - 2];
        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();
        boolean isFirst = true;

        for (int i = 0; i < range.length(); i++) {
            if (i < range.length() - 1 && range.charAt(i) == '.' && range.charAt(i + 1) == '.') {
                i++;
                isFirst = !isFirst;
                continue;
            }
            if (isFirst) {
                start.append(range.charAt(i));
            }
            else {
                end.append(range.charAt(i));
            }
        }

        return String.format(
                "var %s: integer is %s\n" +
                "if %s > %s then\n" +
                " %s := %s\n" +
                "end\n" +
                "%s := %s - 1\n" +
                "while (%s < %s) or (%s < %s) loop\n" +
                "%s := %s + 1",
                parts[1], start.toString(),
                parts[1], end.toString(),
                parts[1], end.toString(),
                parts[1], parts[1],
                parts[1], start.toString(), parts[1], end.toString(),
                parts[1], parts[1]);
    }
}
