package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int counter = 1;
        int biggestCount = 0;
        int element = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
                if (counter > biggestCount) {
                    biggestCount = counter;
                    element = arr[i];
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 0; i < biggestCount; i++) {
            System.out.print(element + " ");
        }
    }
}
