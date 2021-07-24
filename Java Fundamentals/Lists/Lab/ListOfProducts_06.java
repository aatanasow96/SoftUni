package Lists.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            products.add(scanner.nextLine());
        }
        printSortedList(products);
    }

    private static void printSortedList(List<String> products) {
        int index = 1;
        Collections.sort(products);
        for (String product : products) {
            System.out.printf("%d.%s\n", index, product);
            index++;
        }
    }
}