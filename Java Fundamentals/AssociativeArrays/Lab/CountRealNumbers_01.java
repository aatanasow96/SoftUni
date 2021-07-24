package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> counts = new TreeMap<>();
        for (double number : numbers) {
            if (!counts.containsKey(number)) {
                counts.put(number, 1);
            } else {
                counts.put(number, counts.get(number) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}