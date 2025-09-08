import context.StringStrategyContext;
import enums.StringStrategyEnum;
import org.junit.jupiter.api.Test;

public class StringReduceTest {

    @Test
    public void testReduceString() {
        StringStrategyContext context = new StringStrategyContext();
        context.setStrategy(StringStrategyEnum.REDUCE);
        System.out.println("======reduce string=====");
        String input = "aabcccbbad";
        context.reduceAndSteps(input);
    }

    @Test
    public void testReduceAndReplaceString() {
        StringStrategyContext context = new StringStrategyContext();
        context.setStrategy(StringStrategyEnum.REDUCE_REPLACE);
        System.out.println("======reduce and replace string=====");
        String input = "abcccbad";
        context.reduceAndSteps(input);
    }
}
