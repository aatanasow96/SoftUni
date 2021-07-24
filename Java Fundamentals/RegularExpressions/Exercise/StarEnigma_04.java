package RegularExpressions.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\@(?<planet>[A-Z][a-z]+)([^-@!:>])*" +
                "\\:(?<population>\\d*)([^-@!:>])*" +
                "\\!(?<type>A|D)\\!([^-@!:>])*" +
                "\\-\\>(?<soldiers>\\d*)";
        Pattern pattern = Pattern.compile(regex);

        int messages = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> attackedPlanets = new TreeMap<>();
        Map<String, Integer> destroyedPlanets = new TreeMap<>();
        for (int i = 1; i <= messages; i++) {
            String encryptedMessage = scanner.nextLine();
            Matcher matcher = pattern.matcher(decryptMessage(encryptedMessage));
            while (matcher.find()) {
                if (matcher.group("type").equals("A")) {
                    attackedPlanets.put(matcher.group("planet"), 1);
                } else {
                    destroyedPlanets.put(matcher.group("planet"), 1);
                }
            }
        }

        if (attackedPlanets.isEmpty()) {
            System.out.println("Attacked planets: 0");
        } else {
            System.out.println("Attacked planets: " + attackedPlanets.size());
            attackedPlanets.keySet().forEach(k -> System.out.println("-> " + k));
        }

        if (destroyedPlanets.isEmpty()) {
            System.out.println("Destroyed planets: 0");
        } else {
            System.out.println("Destroyed planets: " + destroyedPlanets.size());
            destroyedPlanets.keySet().forEach(k -> System.out.println("-> " + k));
        }

    }

    private static String decryptMessage(String input) {
        String encryptedMessage = input.toLowerCase();
        int decryptionKey = 0;
        for (int j = 0; j < encryptedMessage.length(); j++) {
            switch (encryptedMessage.charAt(j)) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                    decryptionKey++;
            }
        }

        StringBuilder message = new StringBuilder();
        for (int j = 0; j < input.length(); j++) {
            message.append((char) (input.charAt(j) - decryptionKey));
        }

        return message.toString();
    }
}
