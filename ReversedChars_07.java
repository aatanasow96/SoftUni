package DataTypes_and_Variables.Lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        char three = scanner.nextLine().charAt(0);

        String result = String.format("%c %c %c", three, two, one);
        System.out.println(result);
    }
}
