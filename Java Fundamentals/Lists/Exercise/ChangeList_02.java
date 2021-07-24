package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Delete")) {
                numbers.removeAll(Arrays.asList(Integer.parseInt(tokens[1])));
            } else if (tokens[0].equals("Insert")) {
                int element = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                numbers.add(index, element);
            }
            command = scanner.nextLine();
        }
        printList(numbers);
    }
    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
