package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+");
            String name = tokens[0];
            if (tokens.length == 3) {
                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    names.add(name);
                }
            } else if (tokens.length == 4) {
                if (!names.contains(name)) {
                    System.out.printf("%s is not in the list!\n", name);
                } else {
                    names.remove(name);
                }
            }
        }
        printList(names);
    }

    private static void printList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}