package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int number = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (validateIndex(index, numbers)) {
                        numbers.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (validateIndex(Integer.parseInt(tokens[1]), numbers)) {
                        numbers.remove(Integer.parseInt(tokens[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    shift(direction, count, numbers);
                    break;
            }
            command = scanner.nextLine();
        }
        printList(numbers);
    }

    private static void shift(String direction, int count, List<Integer> numbers) {
        if (direction.equals("left")) {
            for (int i = 0; i < count; i++) {
                int numberToShift = numbers.get(0);
                numbers.remove(0);
                numbers.add(numberToShift);
            }
        } else if (direction.equals("right")) {
            for (int i = 0; i < count; i++) {
                int numberToShift = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(0, numberToShift);
            }
        }
    }

    public static boolean validateIndex(int index, List<Integer> numbers) {
        return index >= 0 && index < numbers.size();
    }

    public static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}