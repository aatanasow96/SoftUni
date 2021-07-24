package FinalExams_02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();

        String input;
        while (!"Travel".equals(input = scanner.nextLine())) {
            String[] commands = input.split(":");
            switch (commands[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(commands[1]);
                    String toAdd = commands[2];

                    if (index >= 0 && index < stops.length()) {
                        StringBuilder sb = new StringBuilder(stops);
                        stops = sb.insert(index, toAdd).toString();
                    }

                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);

                    if (startIndex < stops.length() && startIndex >= 0 &&
                            endIndex < stops.length() && endIndex >= 0) {
                        StringBuilder sb = new StringBuilder(stops);
                        stops = sb.replace(startIndex, endIndex + 1, "").toString();
                    }

                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = commands[1];
                    String newString = commands[2];

                    if (stops.contains(oldString) && !oldString.equals(newString)) {
                        stops = stops.replace(oldString, newString);
                    }

                    System.out.println(stops);
                    break;
            }
        }

        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
