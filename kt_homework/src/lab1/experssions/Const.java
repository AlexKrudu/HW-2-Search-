package lab1.experssions;

public class Const implements Expression {
    public Const(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public String toMiniString() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Expression other) {
        if (other instanceof Const) {
            return this.evaluate() == other.evaluate();
        } else {
            return false;
        }
    }

    @Override
    public int evaluate(Integer value) {
        return evaluate();
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public int getPriority() {
        return 0;
    }

    private int value;
}
