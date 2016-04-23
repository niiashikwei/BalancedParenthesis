/**
 * Created by user on 4/17/16.
 */
public class Parenthesis {
    private final char left;
    private final char right;

    public Parenthesis(char left, char right) {
        this.left = left;
        this.right = right;
    }

    public boolean isLeft(char c) {
        return c == left;
    }

    public boolean isRight(char c) {
        return c == right;
    }


    public boolean isSameType(char c) {
        return (c == left || c == right);
    }
}
