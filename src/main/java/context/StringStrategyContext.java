package context;

import enums.StringStrategyEnum;
import strategy.ReduceAndReplaceStrategy;
import strategy.ReduceStrategy;
import strategy.StringStrategy;

import java.util.List;
import java.util.Objects;

public class StringStrategyContext {

    private StringStrategy strategy;

    public StringStrategyContext() {
        this.strategy = new ReduceStrategy();
    }

    public void setStrategy(StringStrategyEnum strategyEnum) {
        if (StringStrategyEnum.REDUCE == strategyEnum) {
            this.strategy = new ReduceStrategy();
        } else {
            this.strategy = new ReduceAndReplaceStrategy();
        }
    }

    public void reduceAndSteps(String input) {
        Objects.requireNonNull(input);
        System.out.println("input:" + input);
        List<String> steps = strategy.reduceAndSteps(input);
        System.out.println("output:");
        if (steps.isEmpty()) {
            System.out.println("->" + input);
        } else {
            steps.stream().forEach(s -> System.out.println("->" + s));
        }

    }
}
