package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        if (list1.size() >= list2.size()) {
            int index = 1;
            for (int number : list2) {
                list1.add(index, number);
                index += 2;
            }
            printList(list1);
        } else {
            int index = 0;
            for (int number : list1) {
                list2.add(index, number);
                index += 2;
            }
            printList(list2);
        }
    }

    private static void printList(List<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
    }
}