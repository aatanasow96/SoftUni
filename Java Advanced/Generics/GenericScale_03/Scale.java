package Generics;

public class Scale<T extends Comparable> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @SuppressWarnings("unchecked")
    public T getHeavier() {
        if (this.left.compareTo(this.right) == 0) {
            return null;
        } else if (this.left.compareTo(this.right) < 0) {
            return right;
        }
        return left;
    }
}
