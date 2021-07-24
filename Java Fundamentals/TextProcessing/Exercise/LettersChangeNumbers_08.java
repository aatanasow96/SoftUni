package TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String word : words) {
            double num = Double.parseDouble(word.substring(1, word.length() - 1));
            char firstLetter = word.charAt(0);
            if (Character.isUpperCase(word.charAt(0))) {
                sum += num / (firstLetter - 64);
            } else if (Character.isLowerCase(word.charAt(0))) {
                sum += num * (firstLetter - 96);
            }

            char lastLetter = word.charAt(word.length() - 1);
            if (Character.isUpperCase(word.charAt(word.length() - 1))) {
                sum -= lastLetter - 64;
            } else if (Character.isLowerCase(word.charAt(word.length() - 1))) {
                sum += lastLetter - 96;
            }
        }

        System.out.printf("%.2f", sum);
    }
}
