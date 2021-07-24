package Basic_Syntax.Exercise;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsets = lostGames / 2;
        int mouse = lostGames / 3;
        int keyboards = lostGames / 6;
        int displays = lostGames / 12;

        double headsetSum = headsets * headsetPrice;
        double mouseSum = mouse * mousePrice;
        double keyboardSum = keyboards * keyboardPrice;
        double displaySum = displays * displayPrice;

        double totalSum = headsetSum + mouseSum + keyboardSum + displaySum;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
