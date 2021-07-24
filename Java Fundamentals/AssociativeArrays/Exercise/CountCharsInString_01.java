package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split("\\s+");
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (String word : input) {
            for (int charIndex = 0; charIndex < word.length(); charIndex++) {
                if (charCount.containsKey(word.charAt(charIndex))) {
                    charCount.put(word.charAt(charIndex), charCount.get(word.charAt(charIndex)) + 1);
                } else {
                    charCount.put(word.charAt(charIndex), 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}