package Basic_Syntax.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.80;
                } else {
                    price = 10.46;
                }

                if (number >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                } else {
                    price = 16;
                }

                if (number >= 100) {
                    number -= 10;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else {
                    price = 22.50;
                }

                if (number >= 10 && number <= 20) {
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.02f", price * number);
    }
}