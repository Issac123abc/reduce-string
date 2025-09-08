package strategy;

import java.util.ArrayList;
import java.util.List;

public class ReduceStrategy implements StringStrategy{

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
                String replace = input.replace(substring, "");
                steps.add(replace);
                reduceAndSteps(replace);
                break;
            }
        }
        return steps;
    }
}
