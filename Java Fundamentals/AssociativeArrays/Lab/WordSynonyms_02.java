package AssociativeArrays.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> synonymMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            synonymMap.putIfAbsent(word, new ArrayList<>());
            synonymMap.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : synonymMap.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
