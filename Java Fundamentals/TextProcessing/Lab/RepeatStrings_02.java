package TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsToRepeat = scanner.nextLine().split("\\s+");
        for (String word : wordsToRepeat) {
            for (int i = 0; i < word.length(); i++) {
                System.out.print(word);
            }
        }
    }
}
