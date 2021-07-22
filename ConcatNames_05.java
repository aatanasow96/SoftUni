package DataTypes_and_Variables.Lab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = String.format("%s%s%s", name1, delimiter, name2);
        System.out.println(result);
    }
}
