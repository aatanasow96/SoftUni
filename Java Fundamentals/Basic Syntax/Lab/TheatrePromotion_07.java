package Basic_Syntax.Lab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        switch (day) {
            case "Weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price = 12;
                } else if (age <= 64) {
                    price = 18;
                }
                break;

            case "Weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price = 15;
                } else if (age <= 64) {
                    price = 20;
                }
                break;

            case "Holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } else if (age <= 64) {
                    price = 12;
                } else if (age <= 122) {
                    price = 10;
                }
                break;
        }

        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.println(price + "$");
        }
    }
}
