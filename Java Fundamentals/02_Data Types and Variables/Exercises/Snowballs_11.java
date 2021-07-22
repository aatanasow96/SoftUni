package DataTypes_and_Variables.Exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double snowballMaxValue = Double.NEGATIVE_INFINITY;
        String result = "";

        for (int snowball = 0; snowball < numberOfSnowballs; snowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = 0;
            snowballValue = Math.pow(((double) snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > snowballMaxValue) {
                snowballMaxValue = snowballValue;
                result = String.format("%d : %d = %.0f (%d)",
                        snowballSnow, snowballTime, snowballMaxValue, snowballQuality);
            }
        }
        System.out.println(result);
    }
}
