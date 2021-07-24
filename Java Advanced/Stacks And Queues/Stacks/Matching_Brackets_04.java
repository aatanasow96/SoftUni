package Stacks_And_Queues.Lab.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Matching_Brackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> startingSubStringIndexes = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                startingSubStringIndexes.push(i);
            } else if (input.charAt(i) == ')') {
                String contents = input.substring(startingSubStringIndexes.pop(), i + 1);
                System.out.println(contents);
            }
        }
    }
}
