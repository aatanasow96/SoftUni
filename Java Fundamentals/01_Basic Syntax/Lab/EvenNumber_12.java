package Basic_Syntax.Lab;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isEven = false;

        while (!isEven) {
            if (n % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(n));
                isEven = true;
            } else {
                System.out.println("Please write an even number.");
                n = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
