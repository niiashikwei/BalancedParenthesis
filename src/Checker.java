import java.util.Stack;

public class Checker {
    private DefaultParenthesisConfiguration defaultParenthesisConfiguration;

    public Checker(DefaultParenthesisConfiguration defaultParenthesisConfiguration){
        this.defaultParenthesisConfiguration = defaultParenthesisConfiguration;
    }

    public boolean checkBalanced(String input) {
        //optimizations
        if(input.isEmpty()) return true;
        if(input.length() % 2 != 0) return false;

        //core
        Stack<Character> stackOfInput = new Stack<Character>();
        char[] charInput = input.toCharArray();

        for (char c : charInput){
            //if invalid character then doesn't match, return false
            Parenthesis parenthesis;
            try {
                parenthesis = defaultParenthesisConfiguration.getParenthesisForChar(c);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

            //add left parenthesis to stack
            if (parenthesis.isLeft(c)){
                stackOfInput.add(c);
                continue;
            }

            //continue if right parenthesis and stack isn't empty
            if (parenthesis.isRight(c) && !stackOfInput.isEmpty()){
                Character peek = stackOfInput.peek();
                if (parenthesis.isLeft(peek)){
                    stackOfInput.pop(); //if parenthesis matches/completes last one on stack
                }else{
                    return false; //if right parenthesis isn't matched by last parenthesis on stack
                }
            }else{ //if stack is empty or and parenthesis is right, doesn't match return false
                return false;
            }
        }
        return stackOfInput.isEmpty();
    }

}
