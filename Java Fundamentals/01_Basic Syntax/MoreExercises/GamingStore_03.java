package Basic_Syntax.MoreExercises;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double totalSpent = 0;

        while (!game.equals("Game Time")) {
            double price = 0;
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    game = scanner.nextLine();
                    continue;
            }

            if (money >= price) {
                money -= price;
                totalSpent += price;
                System.out.printf("Bought %s\n", game);
            } else {
                System.out.println("Too Expensive");
            }

            if (money == 0) {
                System.out.println("Out of money!");
                break;
            }
            game = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, money);
    }
}
