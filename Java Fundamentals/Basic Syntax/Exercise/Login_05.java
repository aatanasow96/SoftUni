package Basic_Syntax.Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        StringBuilder passwordBuilder = new StringBuilder().append(user).reverse();
        String password = passwordBuilder.toString();
        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals(password)) {
            counter++;

            if (counter == 4) {
                break;
            }

            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (counter == 4) {
            System.out.printf("User %s blocked!", user);
        } else {
            System.out.printf("User %s logged in.", user);
        }
    }
}
