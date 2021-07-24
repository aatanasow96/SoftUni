package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.println(getArea(width, height));
    }

    static int getArea(int a, int b) {
        return a * b;
    }
}
