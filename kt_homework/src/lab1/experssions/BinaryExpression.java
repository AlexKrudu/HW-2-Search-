package lab1.experssions;


import javafx.util.Pair;

public abstract class BinaryExpression implements Expression {
    BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Expression other) {
        if (this.getClass().equals(other.getClass())) {
            return this.left.equals(((BinaryExpression) other).left)
                    && this.right.equals(((BinaryExpression) other).right);
        }
        return false;
    }

    Pair<String, String> getMiniStrings(){
        String leftMs, rightMs;

        if (this.getPriority() < left.getPriority()) {
            leftMs = '(' + left.toMiniString() + ')';
        } else {
            leftMs = left.toMiniString();
        }

        if (this.getPriority() < right.getPriority()) {
            rightMs = '(' + right.toMiniString() + ')';
        } else {
            rightMs = right.toMiniString();
        }

        return new Pair<>(leftMs, rightMs);
    }

    Expression left;
    Expression right;
}
