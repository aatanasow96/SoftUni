package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> deck1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> deck2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (deck1.size() > 0 && deck2.size() > 0) {
            int cardValuePlayer1 = deck1.get(0);
            int cardValuePlayer2 = deck2.get(0);
            remove(deck1, deck2);

            if (cardValuePlayer1 > cardValuePlayer2) {
                add(deck1, deck2, cardValuePlayer1, cardValuePlayer2);
            } else if (cardValuePlayer2 > cardValuePlayer1) {
                add(deck1, deck2, cardValuePlayer1, cardValuePlayer2);
            }
        }
        printResult(deck1, deck2);
    }

    private static void add(List<Integer> deck1, List<Integer> deck2, int cardValuePlayer1, int cardValuePlayer2) {
        if (cardValuePlayer1 > cardValuePlayer2) {
            deck1.add(cardValuePlayer1);
            deck1.add(cardValuePlayer2);
        } else {
            deck2.add(cardValuePlayer2);
            deck2.add(cardValuePlayer1);
        }
    }

    private static void remove(List<Integer> deck1, List<Integer> deck2) {
        deck1.remove(0);
        deck2.remove(0);
    }

    private static void printResult(List<Integer> deck1, List<Integer> deck2) {
        int sum = 0;
        if (deck1.size() > deck2.size()) {
            for (int num : deck1) {
                sum += num;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            for (int num : deck2) {
                sum += num;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
