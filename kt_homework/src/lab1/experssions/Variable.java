package lab1.experssions;

public class Variable implements Expression {
    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String toMiniString() {
        return name;
    }

    @Override
    public boolean equals(Expression other) {
        if (other instanceof Variable) {
            return this.name.equals(((Variable) other).name);
        } else {
            return false;
        }
    }

    @Override
    public int evaluate(Integer value) {
        if (value != null) {
            return value;
        } else {
            throw new NullPointerException("Variable evaluation cannot be null");
        }
    }

    @Override
    public int evaluate() {
        throw new NullPointerException("Variable evaluation cannot be null");
    }

    @Override
    public int getPriority() {
        return 0;
    }

    private String name;
}
