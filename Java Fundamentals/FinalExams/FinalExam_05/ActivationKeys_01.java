package FinalExams.FinalExam_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] rawKey = scanner.nextLine().toCharArray();
        List<Character> activationKey = new ArrayList<>();
        String input = scanner.nextLine();

        for (char c : rawKey) {
            activationKey.add(c);
        }

        while (!input.equals("Generate")) {
            String[] commands = input.split(">>>");
            switch (commands[0]) {
                case "Contains":
                    String substring = commands[1];
                    contains(activationKey, substring);
                    break;
                case "Flip":
                    String flipCase = commands[1];
                    int startIndex = Integer.parseInt(commands[2]);
                    int endIndex = Integer.parseInt(commands[3]);
                    if (flipCase.equals("Upper")) {
                        changeToUpper(activationKey, startIndex, endIndex);
                    } else {
                        changeToLower(activationKey, startIndex, endIndex);
                    }
                    break;
                case "Slice":
                    int start = Integer.parseInt(commands[1]);
                    int end = Integer.parseInt(commands[2]);
                    activationKey.removeAll(activationKey.subList(start, end));
                    break;
            }

            if (!commands[0].equals("Contains")) {
                StringBuilder result = new StringBuilder();
                for (Character character : activationKey) {
                    result.append(character);
                }
                System.out.println(result.toString());
            }
            input = scanner.nextLine();
        }

        StringBuilder result = new StringBuilder();
        for (Character character : activationKey) {
            result.append(character);
        }
        System.out.printf("Your activation key is: %s", result.toString());
    }

    private static void changeToUpper(List<Character> activationKey, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            activationKey.set(i, Character.toUpperCase(activationKey.get(i)));
        }
    }

    private static void changeToLower(List<Character> activationKey, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            activationKey.set(i, Character.toLowerCase(activationKey.get(i)));
        }
    }

    public static void contains(List<Character> activationKey, String substring) {
        StringBuilder keyToString = new StringBuilder();
        for (Character character : activationKey) {
            keyToString.append(character);
        }

        if (keyToString.toString().contains(substring)) {
            System.out.printf("%s contains %s\n", keyToString.toString(), substring);
        } else {
            System.out.println("Substring not found!");
        }
    }
}