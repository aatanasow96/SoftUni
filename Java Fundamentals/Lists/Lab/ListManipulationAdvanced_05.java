package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String operation = tokens[1];
                    print(numbers, operation);
                    break;
                case "Get":
                    System.out.println(getSum(numbers));
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int number = Integer.parseInt(tokens[2]);
                    filter(numbers, condition, number);
                    break;
            }
            command = scanner.nextLine();
        }
    }

    private static void filter(List<Integer> numbers, String condition, int number) {
        switch (condition) {
            case "<":
                for (int num : numbers) {
                    if (num < number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int num : numbers) {
                    if (num > number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int num : numbers) {
                    if (num <= number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int num : numbers) {
                    if (num >= number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
        }
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void print(List<Integer> numbers, String operation) {
        for (Integer number : numbers) {
            if (operation.equals("even")) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            } else if (operation.equals("odd")) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
        }
        System.out.println();
    }
}