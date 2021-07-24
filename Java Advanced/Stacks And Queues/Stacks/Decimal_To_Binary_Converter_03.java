package Stacks_And_Queues.Lab.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_To_Binary_Converter_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        if (n == 0) {
            System.out.println(0);
        } else {
            while (n != 0) {
                binaryNumber.push(n % 2);
                n /= 2;
            }
        }

        for (Integer e : binaryNumber) {
            System.out.print(e);
        }
    }
}
