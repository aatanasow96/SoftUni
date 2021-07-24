package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int currentIndex = 0;
        boolean indexFound = false;

        for (int index = 0; index < arr.length; index++) {
            int leftSum = 0, rightSum = 0;
            currentIndex = index;
            for (int i = 0; i < index; i++) {
                leftSum += arr[i];
            }
            for (int i = index + 1; i < arr.length; i++) {
                rightSum += arr[i];
            }
            if (leftSum == rightSum) {
                indexFound = true;
                break;
            }
        }
        if (indexFound) {
            System.out.println(currentIndex);
        } else {
            System.out.println("no");
        }
    }
}
