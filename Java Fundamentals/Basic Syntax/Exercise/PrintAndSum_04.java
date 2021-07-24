package Basic_Syntax.Exercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startingNumber; i <= endNumber; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
