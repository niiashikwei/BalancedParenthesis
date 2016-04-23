
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

    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Parenthesis parenthesis = (Parenthesis) o;
        return parenthesis.isSameType(left) && parenthesis.isSameType(right);
    }

    @Override
    public String toString(){
        return left + " " + right;
    }
}
