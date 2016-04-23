
public class ParenthesisConfiguration {
    private static Parenthesis[] PARENTHESIS_STORE = new Parenthesis[]{
            new Parenthesis('(', ')'),
            new Parenthesis('[', ']'),
            new Parenthesis('{', '}')
    };

    public Parenthesis getParenthesisForChar(char c) throws Exception {
        for (Parenthesis parenthesis : PARENTHESIS_STORE){
            if(parenthesis.isSameType(c)){
                return parenthesis;
            }
        }

        throw new Exception("Parenthesis not found for char -> " + c);
    }
}
