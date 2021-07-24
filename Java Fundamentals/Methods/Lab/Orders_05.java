package Methods.Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = scanner.nextInt();

        System.out.printf("%.2f", getPrice(product, quantity));
    }

    static double getPrice(String product, int quantity) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        return price * quantity;
    }
}