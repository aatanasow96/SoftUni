package TextProcessing.Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.nextLine();
        String input = scanner.nextLine();
        while (input.contains(toRemove)) {
          input = input.replaceAll(toRemove, "");
        }
        System.out.println(input);
    }
}
