package DataTypes_and_Variables.Exercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double kegWithMaxVolume = Double.NEGATIVE_INFINITY;
        String modelWithMaxVolume = "";

        for (int keg = 0; keg < numberOfKegs; keg++) {
            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double volume = 0;
            volume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;

            if (volume > kegWithMaxVolume) {
                kegWithMaxVolume = volume;
                modelWithMaxVolume = kegModel;
            }
        }
        System.out.println(modelWithMaxVolume);
    }
}
