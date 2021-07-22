package Basic_Syntax.Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String insertedMoney = scanner.nextLine();
        double totalMoney = 0;

        while (!insertedMoney.equals("Start")) {
            double money = Double.parseDouble(insertedMoney);

            if (money == 0.1) {
                totalMoney += money;
            } else if (money == 0.2) {
                totalMoney += money;
            } else if (money == 0.5) {
                totalMoney += money;
            } else if (money == 1) {
                totalMoney += money;
            } else if (money == 2) {
                totalMoney += money;
            } else {
                System.out.printf("Cannot accept %.02f\n", money);
            }

            insertedMoney = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")) {
            double price = 0;
            switch (product) {
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
                    continue;
            }

            if (totalMoney >= price) {
                System.out.printf("Purchased %s\n", product);
                totalMoney -= price;
            } else {
                System.out.println("Sorry, not enough money");
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.02f", totalMoney);
    }
}
