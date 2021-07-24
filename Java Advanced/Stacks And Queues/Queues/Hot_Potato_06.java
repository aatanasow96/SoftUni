package Stacks_And_Queues.Lab.Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Hot_Potato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> players = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());

        while (players.size() > 1) {

            for (int i = 1; i < n; i++) {
                String potato = players.poll();
                players.offer(potato);
            }
            System.out.printf("Removed %s\n", players.poll());
        }

        System.out.printf("Last is %s", players.poll());
    }
}