package AssociativeArrays.Lab;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().split("\\s+");
        Map<String, Integer> occurrences = new LinkedHashMap<>();
        for (String word : words) {
            if (!occurrences.containsKey(word)) {
                occurrences.put(word, 1);
            } else {
                occurrences.put(word, occurrences.get(word) + 1);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }
        String output = String.join(", ", result);
        System.out.println(output);
    }
}