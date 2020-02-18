package lab1.experssions;

public interface ToMiniString {
    default String toMiniString() {
        return toString();
    }
}