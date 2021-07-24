package Methods.Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        findTopNumbers(number);
    }

    static void findTopNumbers(int number) {
        for (int i = 1; i <= number ; i++) {
            int sum = 0;
            boolean hasOddDigit = false;
            int currentNumber = i;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber /= 10;
                if (currentNumber % 2 != 0) {
                    hasOddDigit = true;
                }
            }
            if (sum % 8 == 0 && hasOddDigit) {
                System.out.println(i);
            }
        }
    }
}