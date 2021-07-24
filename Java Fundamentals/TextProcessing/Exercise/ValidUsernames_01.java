package TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        for (String username : usernames) {
            if (validateUsername(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean validateUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))
                    && username.charAt(i) != '-'
                    && username.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }
}