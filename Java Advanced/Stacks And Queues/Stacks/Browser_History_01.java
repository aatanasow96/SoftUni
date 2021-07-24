package Stacks_And_Queues.Lab.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        String currentURL = null;

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    currentURL = history.pop();
                }
            } else {
                if (currentURL != null) {
                    history.push(currentURL);
                }
                currentURL = command;
            }

            System.out.println(currentURL);
            command = scanner.nextLine();
        }
    }
}
