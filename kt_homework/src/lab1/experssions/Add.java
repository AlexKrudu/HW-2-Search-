package lab1.experssions;

import javafx.util.Pair;

public class Add extends BinaryExpression {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return '(' + left.toString() + " + " + right.toString() + ')';
    }

    @Override
    public String toMiniString() {
        Pair p = this.getMiniStrings();
        return p.getKey() + " + " + p.getValue();
    }

    @Override
    public int evaluate(Integer value) {
        return left.evaluate(value) + right.evaluate(value);
    }

    @Override
    public int evaluate() {
        return evaluate(null);
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
