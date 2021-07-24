package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] tokens = command.split("\\s+");
            int startIndex = Integer.parseInt(tokens[1]);
            int endIndex = Integer.parseInt(tokens[2]);
            switch (tokens[0]) {
                case "merge":
                    merge(input, startIndex, endIndex);
                    break;
                case "divide":
                    divide(input, startIndex, endIndex);
                    break;
            }
            command = scanner.nextLine();
        }
        printList(input);
    }

    private static void divide(List<String> input, int start, int end) {
        start = Math.max(0, start);
        int tokenLength = input.get(start).length() / end;
        List<String> tokens = Arrays.stream(input.get(start).split("")).collect(Collectors.toList());
        input.remove(start);
        int i = 0;
        while (tokens.size() > 0) {
            StringBuilder dividedTokens = new StringBuilder();
            for (int j = 0; j < tokenLength; j++) {
                if (i == end - 1) {
                    for (String token : tokens) {
                        dividedTokens.append(token);
                    }
                    break;
                }
                dividedTokens.append(tokens.get(0));
                tokens.remove(0);
            }
            input.add(start + i, dividedTokens.toString());
            if (i == end - 1) {
                break;
            }
            i++;

        }
    }

    private static void merge(List<String> input, int start, int end) {
        start = Math.max(0, start);
        end = Math.min(end, input.size());
        StringBuilder mergedToken = new StringBuilder();
        int index = start;
        while (index != input.size() && index <= end) {
            mergedToken.append(input.get(index));
            index++;
        }
        if (end == input.size()) {
            input.subList(start, end).clear();
        } else {
            input.subList(start, end + 1).clear();
        }
        input.add(start, mergedToken.toString());
    }

    private static void printList(List<String> input) {
        for (String e : input) {
            System.out.print(e + " ");
        }
    }
}