package TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(getEncryptedMessage(input));
    }

    private static String getEncryptedMessage(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            encrypted.append((char) (input.charAt(i) + 3));
        }
        return encrypted.toString();
    }
}
