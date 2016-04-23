import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefaultParenthesisConfigurationTest {
    @Test(expected = ParenthesisNotFoundException.class)
    public void shouldThrowExceptionIfParenthesisNotFound() throws Exception {
        DefaultParenthesisConfiguration defaultParenthesisConfiguration = new DefaultParenthesisConfiguration();
        defaultParenthesisConfiguration.getParenthesisForChar('f');
    }

    @Test
    public void shouldReturnParenthesisIfParenthesis() throws Exception {
        DefaultParenthesisConfiguration defaultParenthesisConfiguration = new DefaultParenthesisConfiguration();
        Parenthesis parenthesisForChar = defaultParenthesisConfiguration.getParenthesisForChar('(');
        assertThat(parenthesisForChar, is(new Parenthesis('(', ')')));
    }

    @Test
    public void shouldParenthesisIfBracket() throws Exception {
        DefaultParenthesisConfiguration defaultParenthesisConfiguration = new DefaultParenthesisConfiguration();
        Parenthesis parenthesisForChar = defaultParenthesisConfiguration.getParenthesisForChar(']');
        assertThat(parenthesisForChar, is(new Parenthesis('[', ']')));
    }

    @Test
    public void shouldParenthesisIfCurlyBrace() throws Exception {
        DefaultParenthesisConfiguration defaultParenthesisConfiguration = new DefaultParenthesisConfiguration();
        Parenthesis parenthesisForChar = defaultParenthesisConfiguration.getParenthesisForChar('{');
        assertThat(parenthesisForChar, is(new Parenthesis('{', '}')));
    }
}