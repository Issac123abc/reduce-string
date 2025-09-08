package strategy;

import java.util.ArrayList;
import java.util.List;

public class ReduceAndReplaceStrategy implements StringStrategy {

    private List<String> steps = new ArrayList<>();

    public List<String> reduceAndSteps(String input) {
        for (int i = 0; i < input.length(); i++) {
            int j = i + 1;
            for (; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    continue;
                } else {
                    break;
                }
            }
            if (j - i > 2) {
                String substring = input.substring(i, j);
                String replace = input.replace(substring, getPrefixChar(substring.charAt(0)));
                steps.add(replace);
                reduceAndSteps(replace);
                break;
            }
        }
        return steps;
    }

    private static String getPrefixChar(char c) {
        if (c >= 'a' && c <= 'z') {
            if (c == 'a') {
                return "";
            } else {
                return String.valueOf((char) (c -1));
            }
        }else {
            throw new IllegalArgumentException();
        }
    }
}
