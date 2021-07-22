package DataTypes_and_Variables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean isSpecial = false;

        for (int i = 1; i <= number; i++) {
            int currentNum = i;

            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", currentNum, isSpecial);
            sum = 0;
            i = currentNum;
        }
    }
}
