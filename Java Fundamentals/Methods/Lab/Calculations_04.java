package Methods.Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        printResult(operation, num1, num2);
    }

    static void printResult(String operation, int n1, int n2) {
        switch (operation) {
            case "add":
                System.out.println(n1 + n2);
                break;
            case "subtract":
                System.out.println(n1 - n2);
                break;
            case "multiply":
                System.out.println(n1 * n2);
                break;
            case "divide":
                System.out.println(n1 / n2);
                break;
        }
    }
}