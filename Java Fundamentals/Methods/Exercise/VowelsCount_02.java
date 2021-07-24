package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        System.out.println(getVowelsCount(input));
    }

    static int getVowelsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}