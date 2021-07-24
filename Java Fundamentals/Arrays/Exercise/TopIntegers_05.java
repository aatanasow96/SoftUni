package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        int[] numbers = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            boolean isBigger = true;
            for (int index = i + 1; index < numbers.length; index++) {
                if (currentNum <= numbers[index]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
