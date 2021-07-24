package FinalExams.FinalExam_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String digitRegex = "[0-9]";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(input);
        int coolThreshold = 1;

        while (digitMatcher.find()) {
            coolThreshold *= Integer.parseInt(digitMatcher.group());
        }

        System.out.println("Cool threshold: " + coolThreshold);
        String emojiRegex = "(\\:\\:|\\*\\*)(?<emoji>[A-Z]{1}[a-z]{2,})\\1";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(input);

        List<String> coolEmojis = new ArrayList<>();
        int emojisFound = 0;

        while (emojiMatcher.find()) {
            String emoji = emojiMatcher.group("emoji");
            emojisFound++;
            int coolness = 0;
            for (int i = 0; i < emoji.length(); i++) {
                coolness += emoji.charAt(i);
            }

            if (coolness >= coolThreshold) {
                coolEmojis.add(emojiMatcher.group());
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are:\n", emojisFound);
        coolEmojis.forEach(System.out::println);
    }
}