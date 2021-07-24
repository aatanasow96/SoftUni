package DataTypes_and_Variables.Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        byte dayCounter = 0;
        int spice = 0;

        while (startingYield >= 100) {
            dayCounter++;
            spice += startingYield - 26;
            startingYield -= 10;
        }

        if (spice >= 26) {
            spice -= 26;
        } else {
            spice = 0;
        }
        System.out.println(dayCounter);
        System.out.println(spice);
    }
}
