
public class BalancedParenthesis {
    public static void main(String[] input){
        Checker checker = new Checker(new DefaultParenthesisConfiguration());
        String inputString = input[0];
        boolean areBalanced = checker.checkBalanced(inputString);
        if (areBalanced){
            System.out.println("For input '" + inputString + "' parenthesis are balanced.");
        }else{
            System.out.println("For input '" + inputString + "' parenthesis are not balanced.");
        }
    }
}
