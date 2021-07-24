package FinalExams.FinalExam_03Retake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(\\@|\\#+)(?<word1>[A-Za-z]{3,})\\1{2}(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int pairs = 0;
        List<String> mirrorWords = new ArrayList<>();

        while (matcher.find()) {
            pairs++;
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");
            StringBuilder reversedWord2 = new StringBuilder(word2).reverse();

            if (word1.equals(reversedWord2.toString())) {
                mirrorWords.add(word1 + " <=> " + matcher.group("word2"));
            }
        }

        if (pairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!\n", pairs);
        }

        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", mirrorWords));
        }
    }
}
