package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int bombNumber = scanner.nextInt();
        int power = scanner.nextInt();

        while (numbers.contains(bombNumber)) {
            int bombIndex = numbers.indexOf(bombNumber);
            removeNumbers(numbers, bombIndex , power);
        }
        System.out.println(getSum(numbers));
    }

    private static Object getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void removeNumbers(List<Integer> numbers, int bombIndex, int power) {
        int leftIndex = Math.max(0 , bombIndex - power);
        int rightIndex = Math.min(numbers.size() - 1,bombIndex + power);
        numbers.subList(leftIndex, rightIndex + 1).clear();
    }
}