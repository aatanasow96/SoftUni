import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numCount = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .forEach(n -> {
                    numCount.putIfAbsent(n, 0);
                    numCount.put(n, numCount.get(n) + 1);
                });

        numCount.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
