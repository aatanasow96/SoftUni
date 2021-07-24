package DataTypes_and_Variables.Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", (double) meters / 1000);
    }
}
