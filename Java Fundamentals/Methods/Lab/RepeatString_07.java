package Methods.Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = scanner.nextInt();

        System.out.println(repeatString(input, n));
    }

    static String repeatString(String input, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
           result.append(input);
        }
        return result.toString();
    }
}
