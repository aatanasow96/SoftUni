package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            if (tokens.length == 2) {
                wagons.add(Integer.parseInt(tokens[1]));
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        printList(wagons);
    }

    private static void printList(List<Integer> wagons) {
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
