package DataTypes_and_Variables.Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingIndex = Integer.parseInt(scanner.nextLine());
        int endingIndex = Integer.parseInt(scanner.nextLine());

        for (int start = startingIndex; start <= endingIndex; start++) {
            System.out.print((char) start + " ");
        }
    }
}
