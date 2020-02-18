package expression;

import java.util.Objects;

public class Const implements CompositeExpression {

    private final Number value;

    public Const(int value) {
        this.value = value;
    }

    public Const(double value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x) {
        return value.intValue();
    }

    @Override
    public double evaluate(double x) {
        return value.doubleValue();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Const co = (Const) o;
        return co.value.doubleValue() == value.doubleValue();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
