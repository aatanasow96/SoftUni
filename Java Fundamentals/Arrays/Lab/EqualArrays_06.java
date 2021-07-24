package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String[] secondArrayAsStrings = scanner.nextLine().split(" ");
        int[] secondArray = new int[secondArrayAsStrings.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondArrayAsStrings[i]);
        }

        boolean areIdentical = true;
        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }
        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}