package expression;

public class Divide extends BinaryOperation {
    public Divide(CommonExpression arg1, CommonExpression arg2) {
        super(arg1, arg2);
    }

    @Override
    protected double calculate(double a, double b) {
        return a / b;
    }

    @Override
    protected int calculate(int a, int b) {
        return a / b;
    }

    @Override
    protected String getOperation() {
        return "/";
    }
}
