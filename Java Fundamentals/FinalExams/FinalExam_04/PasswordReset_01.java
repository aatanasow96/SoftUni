package FinalExams.FinalExam_04;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String input;

        while (!"Done".equals(input = scanner.nextLine())) {
            String[] commands = input.split("\\s+");
            switch (commands[0]) {
                case "TakeOdd":
                    password = getRawPassword(password);
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    password = cut(password, index, length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commands[1];
                    String substitute = commands[2];

                    if (password.contains(substring)) {
                        password = getReplacement(password, substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
        }
        System.out.println("Your password is: " + password);
    }

    private static String getReplacement(String password, String substring, String substitute) {
        password = password.replace(substring, substitute);
        return password;
    }

    private static String cut(String password, int index, int length) {
        List<Character> cutPassword = password.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        cutPassword.subList(index, index + length).clear();
        password = cutPassword.stream().map(String::valueOf).collect(Collectors.joining());
        return password;
    }

    private static String getRawPassword(String password) {
        StringBuilder rawPassword = new StringBuilder();

        for (int i = 1; i < password.length(); i += 2) {
            rawPassword.append(password.charAt(i));
        }

        password = rawPassword.toString();
        return password;
    }
}
