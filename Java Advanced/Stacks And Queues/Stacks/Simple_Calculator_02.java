package Stacks_And_Queues.Lab.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Simple_Calculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.push(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i++) {
            String token = tokens[i];

            int leftNum = numbers.peek();
            int rightNum = Integer.parseInt(tokens[++i]);
            numbers.push(rightNum);

            int result = token.equals("+")
                    ? leftNum + rightNum
                    : leftNum - rightNum;

            numbers.push(result);
        }

        System.out.println(numbers.peek());
    }
}
