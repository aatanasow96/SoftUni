package DataTypes_and_Variables.Lab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int sum = 0;

            while (currentNum != 0) {
                sum += currentNum % 10;
                currentNum /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }
}
