package TextProcessing.Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            if (text.contains(word)) {
               text = text.replace(word, convertWordToStars(word));
            }
        }
        System.out.println(text);
    }

    private static String convertWordToStars(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append("*");
        }
        return result.toString();
    }
}

