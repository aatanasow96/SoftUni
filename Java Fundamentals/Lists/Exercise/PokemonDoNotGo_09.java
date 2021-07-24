package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int removedSum = 0;
        while (!numbers.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                int indexValue = numbers.get(0);
                removedSum += indexValue;
                numbers.set(0, numbers.get(numbers.size() - 1));
                increaseOrDecrease(numbers, indexValue);
            } else if (index >= numbers.size()) {
                int indexValue = numbers.get(numbers.size() - 1);
                removedSum += indexValue;
                numbers.set(numbers.size() - 1, numbers.get(0));
                increaseOrDecrease(numbers, indexValue);
            } else {
                int indexValue = numbers.get(index);
                removedSum += indexValue;
                numbers.remove(index);
                increaseOrDecrease(numbers, indexValue);
            }
        }
        System.out.println(removedSum);
    }

    private static void increaseOrDecrease(List<Integer> numbers, int indexValue) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= indexValue) {
                numbers.set(i, numbers.get(i) + indexValue);
            } else {
                numbers.set(i, numbers.get(i) - indexValue);
            }
        }
    }
}