import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by user on 4/17/16.
 */
public class ParenthesisTest {
    @Test
    public void shouldReturnTrueForLeftParenthesisOfSameType(){
        Parenthesis parenthesis = new Parenthesis('(', ')');
        boolean result = parenthesis.isLeft('(');
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForRightParenthesisOfSameType(){
        Parenthesis parenthesis = new Parenthesis('[', ']');
        boolean result = parenthesis.isRight(']');
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForLeftParenthesisOfSameType(){
        Parenthesis parenthesis = new Parenthesis('(', ')');
        boolean result = parenthesis.isRight('(');
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForRightParenthesisOfSameType(){
        Parenthesis parenthesis = new Parenthesis('[', ']');
        boolean result = parenthesis.isLeft(']');
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueIfLeftIsSameParenthesisGroup(){
        Parenthesis parenthesis = new Parenthesis('{', '}');
        boolean result = parenthesis.isSameType('{');
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfRightIsSameParenthesisGroup(){
        Parenthesis parenthesis = new Parenthesis('{', '}');
        boolean result = parenthesis.isSameType('}');
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfIsNotSameParenthesisGroup(){
        Parenthesis parenthesis = new Parenthesis('{', '}');
        boolean result = parenthesis.isSameType('(');
        assertFalse(result);
    }
}
