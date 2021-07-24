package Stacks_And_Queues.Lab.Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Printer_Queue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!fileName.equals("print")) {

            if (fileName.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s\n", queue.poll());
                }
            } else {
                queue.offer(fileName);
            }

            fileName = scanner.nextLine();
        }

        for (String s : queue) {
            System.out.println(s);
        }
    }
}
