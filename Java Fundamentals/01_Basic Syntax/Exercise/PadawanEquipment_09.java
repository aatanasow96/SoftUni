package Basic_Syntax.Exercise;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightSaberSum = lightSaberPrice * Math.ceil(1.1 * students);
        double robeSum = robePrice * students;
        int freeBelts = students / 6;
        double beltSum = beltPrice * (students - freeBelts);

        double totalSum = lightSaberSum + robeSum + beltSum;

        if (money >= totalSum) {
            System.out.printf("The money is enough - it would cost %.02flv.", totalSum);
        } else {
            System.out.printf("Ivan Cho will need %.02flv more.", totalSum - money);
        }
    }
}
