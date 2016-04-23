import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by user on 1/31/16.
 */
public class CheckerTest {
    private Checker checker;

    @Before
    public void setup(){
        checker = new Checker(new ParenthesisConfiguration());
    }

    @Test
    public void shouldReturnTrueOnBalancedParenthesis(){
        String input = "()";
        assertThat(checker.checkBalanced(input), is(true));
    }

    @Test
    public void shouldReturnFalseOnUnBalancedParenthesis(){
        String input = ")(";
        assertThat(checker.checkBalanced(input), is(false));
    }

    @Test
    public void shouldReturnTrueForNestedBalancedParenthesis(){
        String input = "(())";
        assertThat(checker.checkBalanced(input), is(true));
    }

    @Test
    public void shouldReturnTrueForDoublyNestedBalancedParenthesis(){
        String input = "(()())";
        assertThat(checker.checkBalanced(input), is(true));
    }

    @Test
    public void shouldReturnTrueForBalancedBrackets(){
        String input = "[]";
        assertThat(checker.checkBalanced(input), is(true));
    }

    @Test
    public void shouldReturnTrueForBalancedCurlyBraces(){
        String input = "{}";
        assertThat(checker.checkBalanced(input), is(true));
    }

}
