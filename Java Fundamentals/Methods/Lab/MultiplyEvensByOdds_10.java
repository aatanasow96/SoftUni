package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(getEvensAndOddsMultiplied(num));
    }

    static int getEvensAndOddsMultiplied(int num) {
        int evenSum = 0, oddSum = 0;
        while (Math.abs(num) > 0) {
            int currentNumber = num % 10;
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
            num /= 10;
        }
        return evenSum * oddSum;
    }
}