package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 1;
        String currentResource = null;
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            if (counter % 2 != 0) {
                resources.putIfAbsent(input, 0);
                currentResource = input;
            } else {
                int quantity = Integer.parseInt(input);
                resources.put(currentResource, resources.get(currentResource) + quantity);
            }
            counter++;
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
