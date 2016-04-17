import java.util.Stack;

public class Checker {

    private static final char OPENING_PARENTHESIS = '(';
    private static final char CLOSING_PARENTHESIS = ')';


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
            if (isOpeningSymbol(c)){
                stackOfInput.add(c);
                continue;
            }

            if (isClosingSymbol(c) && !stackOfInput.isEmpty()){
                Character peek = stackOfInput.peek();
                if (isOpeningSymbol(peek)){
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

    private boolean isClosingSymbol(char c) {
        return c == CLOSING_PARENTHESIS;
    }

    private boolean isOpeningSymbol(char c) {
        return c == OPENING_PARENTHESIS;
    }

}
