package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthDNA = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 1;
        int biggestCounter = Integer.MIN_VALUE;
        int sum = 0;
        int biggestSum = Integer.MIN_VALUE;
        int startingIndex = 0;
        int sample = 1;

        while (!input.equals("Clone them!")) {
            String[] arrayAsString = input.split("!");
            int[] array = new int[lengthDNA];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(arrayAsString[i]);
            }

            for (int i = 0; i < array.length - 1; i++) {
                sum += i;
                if (array[i] == array[i + 1]) {
                    counter++;
                    if (counter > biggestCounter) {
                        biggestCounter = counter;
                        startingIndex = i;
                    }
                } else {
                    counter = 1;
                }
            }
            sample++;
            input = scanner.nextLine();
        }
    }
}
