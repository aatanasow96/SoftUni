package TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (!word.equals("end")) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            System.out.printf("%s = %s\n", word, reversedWord.toString());
            word = scanner.nextLine();
        }
    }
}