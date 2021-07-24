package TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        List<Character> chars = new ArrayList<>();

        for (char c : input) {
            chars.add(c);
        }

        int i = 0;
        while (i < chars.size() - 1) {
            if (chars.get(i) == chars.get(i + 1)) {
                chars.remove(i);
            } else {
                i++;
            }
        }

        for (char c : chars) {
            System.out.print(c);
        }
    }
}
