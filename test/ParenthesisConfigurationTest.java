import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParenthesisConfigurationTest{
    @Test(expected = Exception.class)
    public void shouldThrowExceptionIfParenthesisNotFound() throws Exception {
        ParenthesisConfiguration parenthesisConfiguration = new ParenthesisConfiguration();
        parenthesisConfiguration.getParenthesisForChar('f');
    }

    @Test
    public void shouldParenthesisIfValid() throws Exception {
        ParenthesisConfiguration parenthesisConfiguration = new ParenthesisConfiguration();
        Parenthesis parenthesisForChar = parenthesisConfiguration.getParenthesisForChar('(');
        assertThat(parenthesisForChar, is(new Parenthesis('(', ')')));
    }
}