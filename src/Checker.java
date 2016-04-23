import java.util.Stack;

public class Checker {

    private static final Parenthesis[] PARENTHESIS_STORE = {
            new Parenthesis('(', ')'),
            new Parenthesis('[', ']'),
            new Parenthesis('{', '}')
    };

    public Checker(){

    }

    public boolean checkBalanced(String input) {
        //optimizations
        if(input.isEmpty()) return true;
        if(input.length() % 2 != 0) return false;

        //core
        Stack<Character> stackOfInput = new Stack<Character>();
        char[] charInput = input.toCharArray();

        for (char c : charInput){
            Parenthesis parenthesis;
            try {
                parenthesis = getParenthesisForChar(c);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

            if (parenthesis.isLeft(c)){
                stackOfInput.add(c);
                continue;
            }

            if (parenthesis.isRight(c) && !stackOfInput.isEmpty()){
                Character peek = stackOfInput.peek();
                if (parenthesis.isLeft(peek)){
                    stackOfInput.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return stackOfInput.isEmpty();
    }

    private Parenthesis getParenthesisForChar(char c) throws Exception {
        for (Parenthesis parenthesis : PARENTHESIS_STORE){
            if(parenthesis.isSameType(c)){
                return parenthesis;
            }
        }

        throw new Exception("Parenthesis not found for char -> " + c);
    }
}
