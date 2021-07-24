package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!validateLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validateContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!validateDigitCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (validateLength(password) && validateContent(password) && validateDigitCount(password)) {
            System.out.println("Password is valid");
        }
    }

    static boolean validateLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    static boolean validateContent(String password) {
        boolean isLetterOrDigit = true;
        for (int symbol = 0; symbol < password.length(); symbol++) {
            isLetterOrDigit = Character.isLetterOrDigit(password.charAt(symbol));
            if (!isLetterOrDigit) {
                break;
            }
        }
        return isLetterOrDigit;
    }

    static boolean validateDigitCount(String password) {
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digits++;
            }
        }
        return digits >= 2;
    }
}