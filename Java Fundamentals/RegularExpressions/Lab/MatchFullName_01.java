package RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern fullName = Pattern.compile(regex);
        String input = scanner.nextLine();
        Matcher match = fullName.matcher(input);

        while (match.find()) {
            System.out.print(match.group() + " ");
        }
    }
}
