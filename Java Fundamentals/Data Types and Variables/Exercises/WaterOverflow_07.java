package DataTypes_and_Variables.Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int litresInTank = 0;

        for (int i = 0; i < n; i++) {
            int capacity = 255;
            int litres = Integer.parseInt(scanner.nextLine());
            if (litresInTank + litres > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                litresInTank += litres;
            }
        }
        System.out.println(litresInTank);
    }
}
