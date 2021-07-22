package Basic_Syntax.Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int startingNum = num;
        int factSum = 0;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            factSum += fact;
            num /= 10;
        }

        if (factSum == startingNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
