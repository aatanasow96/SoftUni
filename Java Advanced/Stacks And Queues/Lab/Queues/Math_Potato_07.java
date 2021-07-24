package Stacks_And_Queues.Lab.Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Math_Potato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> players = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        while (players.size() > 1) {

            for (int i = 1; i < n; i++) {
                players.offer(Objects.requireNonNull(players.poll()));
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + players.peek());
            } else {
                System.out.println("Removed " + players.poll());
            }

            cycle++;
        }

        System.out.println("Last is " + players.peek());
    }

    private static boolean isPrime(int cycle) {
        if (cycle <= 1) {
            return false;
        }

        for (int i = 2; i < cycle; i++) {
            if (cycle % i == 0) {
                return false;
            }
        }

        return true;
    }
}
