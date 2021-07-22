package Basic_Syntax.MoreExercises;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numbers; i++) {
            String digit = scanner.nextLine();
            int mainDigit = Character.getNumericValue(digit.charAt(0));
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            }

            int letterIndex = offset + digit.length() - 1;
            int letterCode = letterIndex + 97;
            char letter = (char) letterCode;

            if (mainDigit == 0) {
                letter = (char) 32;
            }
            message.append(letter);
        }
        System.out.println(message);
    }
}