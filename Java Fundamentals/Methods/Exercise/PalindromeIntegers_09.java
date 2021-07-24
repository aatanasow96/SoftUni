package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            System.out.println(isPalindrome(command));
            command = scanner.nextLine();
        }
    }

    static boolean isPalindrome(String command) {
        StringBuilder reversedNum = new StringBuilder();
        for (int i = command.length() - 1; i >= 0; i--) {
            reversedNum.append(command.charAt(i));
        }
        int reversed = Integer.parseInt(reversedNum.toString());
        int number = Integer.parseInt(command);
        return number == reversed;
    }
}