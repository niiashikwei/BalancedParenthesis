import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by user on 1/31/16.
 */
public class CheckerTest {

    @Test
    public void shouldReturnTrueOnBalancedParenthesis(){
        Checker checker = new Checker();
        String input = "()";
        assertThat(checker.checkBalanced(input), is(true));
    }

    @Test
    public void shouldReturnFalseOnUnBalancedParenthesis(){
        Checker checker = new Checker();
        String input = ")(";
        assertThat(checker.checkBalanced(input), is(false));
    }

    @Test
    public void shouldReturnTrueForNestedBalancedParenthesis(){
        Checker checker = new Checker();
        String input = "(())";
        assertThat(checker.checkBalanced(input), is(true));
    }

    @Test
    public void shouldReturnTrueForDoublyNestedBalancedParenthesis(){
        Checker checker = new Checker();
        String input = "(()())";
        assertThat(checker.checkBalanced(input), is(true));
    }

    @Test
    public void shouldReturnTrueForBalancedBrackets(){
        Checker checker = new Checker();
        String input = "[]";
        assertThat(checker.checkBalanced(input), is(true));
    }


}
