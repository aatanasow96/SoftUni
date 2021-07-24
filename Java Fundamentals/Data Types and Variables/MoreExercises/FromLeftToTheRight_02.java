package DataTypes_and_Variables.MoreExercises;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean spaceIsReached = false;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < input.length(); j++) {
                StringBuilder leftNum = new StringBuilder();
                StringBuilder rightNum = new StringBuilder();
                for (char k = input.charAt(0); k <= j; k++) {
                    if (k == 32) {
                        spaceIsReached = true;
                        continue;
                    }
                    if (!spaceIsReached) {
                        leftNum.append(k);
                    } else {
                        rightNum.append(k);
                    }
                }
            }
        }
    }
}
