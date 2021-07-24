package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valueType = scanner.nextLine();
        if (valueType.equals("int")) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(a, b));
        } else {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(getMax(a, b));
        }
    }

    static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}
