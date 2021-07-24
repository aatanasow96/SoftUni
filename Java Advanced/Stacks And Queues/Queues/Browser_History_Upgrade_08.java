package Stacks_And_Queues.Lab.Queues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class Browser_History_Upgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardQueue = new ArrayDeque<>();
        String currentURL = null;

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    forwardQueue.offerFirst(currentURL);
                    currentURL = history.pop();

                }
            } else if (command.equals("forward")) {
                if (forwardQueue.isEmpty()) {
                    System.out.println("no next URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    currentURL = forwardQueue.poll();
                }
            } else {
                if (currentURL != null) {
                    history.push(currentURL);
                }
                currentURL = command;
                forwardQueue.clear();
            }

            System.out.println(currentURL);
            command = scanner.nextLine();
        }
    }
}
