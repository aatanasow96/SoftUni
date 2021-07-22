package DataTypes_and_Variables.Exercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());
        double halfOfPower = (double) power / 2;
        int pokedTargets = 0;

        while (power >= distance) {
            power -= distance;
            pokedTargets++;
            if (power == halfOfPower && exhaustion != 0) {
                power /= exhaustion;
            }
        }
        System.out.println(power);
        System.out.println(pokedTargets);
    }
}
