
public class DefaultParenthesisConfiguration implements ParenthesisConfiguration {
    private static Parenthesis[] PARENTHESIS_STORE = new Parenthesis[]{
            new Parenthesis('(', ')'),
            new Parenthesis('[', ']'),
            new Parenthesis('{', '}')
    };

    @Override
    public Parenthesis getParenthesisForChar(char c) throws Exception {
        for (Parenthesis parenthesis : PARENTHESIS_STORE){
            if(parenthesis.isSameType(c)){
                return parenthesis;
            }
        }

        throw new ParenthesisNotFoundException("Parenthesis not found for char -> " + c);
    }
}
