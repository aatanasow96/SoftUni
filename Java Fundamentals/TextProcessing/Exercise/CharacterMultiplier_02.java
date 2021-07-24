package TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        System.out.println(getSumOfStrings(strings));
    }

    private static Object getSumOfStrings(String[] strings) {
        int sum = 0;
        for (int i = 0; i < Math.max(strings[0].length(), strings[1].length()); i++) {
            if (i >= strings[0].length()) {
                sum += strings[1].charAt(i);
            } else if (i >= strings[1].length()) {
                sum += strings[0].charAt(i);
            } else {
                sum += strings[0].charAt(i) * strings[1].charAt(i);
            }
        }
        return sum;
    }
}
