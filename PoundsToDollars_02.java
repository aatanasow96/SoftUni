package DataTypes_and_Variables.Lab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());
        double exchangeCourse = 1.31;
        System.out.printf("%.3f", pounds * exchangeCourse);
    }
}
