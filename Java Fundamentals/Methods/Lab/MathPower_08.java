package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int power = scanner.nextInt();
        System.out.println(new DecimalFormat("0.####").format(getPower(number, power)));
    }

    static double getPower(double number, int power) {
        return Math.pow(number, power);
    }
}