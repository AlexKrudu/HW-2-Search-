package lab1.experssions;

public interface Expression extends ToMiniString {
    String toString();

    String toMiniString();

    boolean equals(Expression other);

    int evaluate(Integer value);

    int evaluate();

    int getPriority();
}
