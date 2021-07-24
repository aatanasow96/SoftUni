package FinalExams.FinalExam_03Retake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();
        List<Character> message = concealedMessage.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        String input;

        while (!"Reveal".equals(input = scanner.nextLine())) {
            String[] instructions = input.split(":\\|:");
            switch (instructions[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(instructions[1]);
                    concealedMessage = concealedMessage.substring(0, index) + " "
                            + concealedMessage.substring(index);
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    String substring = instructions[1];
                    if (concealedMessage.contains(substring)) {
                        concealedMessage = reverse(concealedMessage, substring);
                        System.out.println(concealedMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String change = instructions[1];
                    String replacement = instructions[2];
                    concealedMessage = concealedMessage.replace(change, replacement);
                    System.out.println(concealedMessage);
                    break;
            }
        }
        System.out.println("You have a new text message: " + concealedMessage);
    }

    private static String reverse(String concealedMessage, String substring) {
        concealedMessage = concealedMessage.replaceFirst(Pattern.quote(substring), "")
                .concat(new StringBuilder(substring).reverse().toString());
        return concealedMessage;
    }

}
