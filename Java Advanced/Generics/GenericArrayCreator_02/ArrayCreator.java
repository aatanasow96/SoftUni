package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator<T> {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item) {
        T[] arr = (T[]) new Object[length];
        Arrays.fill(arr, item);
        return arr;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> tClass, int length, T item) {
        T[] arr = (T[]) Array.newInstance(tClass, length);
        Arrays.fill(arr, item);
        return arr;
    }
}
