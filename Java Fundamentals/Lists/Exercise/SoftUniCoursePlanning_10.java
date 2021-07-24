package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] command = input.split(":");
            String lessonTitle = command[1];
            switch (command[0]){
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    if (!schedule.contains(lessonTitle)) {
                        int index = Integer.parseInt(command[2]);
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    schedule.remove(lessonTitle);
                    schedule.remove(lessonTitle + "-Exercise");
                    break;
                case "Swap":
                    String lessonTitle2 = command[2];
                    swap(schedule, lessonTitle, lessonTitle2);
                    break;
                case "Exercise":
                    addExercise(schedule, lessonTitle);
                    break;
            }

            input = scanner.nextLine();
        }
        printList(schedule);
    }

    private static void swap(List<String> schedule, String lessonTitle1, String lessonTitle2) {
        int indexOfTitle1 = schedule.indexOf(lessonTitle1);
        int indexOfTitle2 = schedule.indexOf(lessonTitle2);
        boolean title1HasExercise = false;
        boolean title2HasExercise = false;
        if (schedule.contains(lessonTitle1 + "-Exercise")) {
            title1HasExercise = true;
        }
        if (schedule.contains(lessonTitle2 + "-Exercise")){
            title2HasExercise = true;
        }
        schedule.set(indexOfTitle1, lessonTitle2);
        schedule.set(indexOfTitle2, lessonTitle1);
        if (title1HasExercise) {
            schedule.remove(lessonTitle1 + "-Exercise");
            schedule.add(indexOfTitle2 + 1, lessonTitle1 + "-Exercise");
        }
        if (title2HasExercise) {
            schedule.remove(lessonTitle2 + "-Exercise");
            schedule.add(indexOfTitle1 + 1, lessonTitle2 + "-Exercise");
        }
    }

    private static void addExercise(List<String> schedule, String lessonTitle) {
        if (schedule.contains(lessonTitle)) {
            if (!schedule.contains(lessonTitle + "-Exercise")) {
                schedule.add(schedule.indexOf(lessonTitle) + 1, lessonTitle + "-Exercise");
            }
        } else {
            schedule.add(lessonTitle);
            schedule.add(lessonTitle + "-Exercise");
        }
    }

    private static void printList(List<String> schedule) {
        int counter = 1;
        for (String lesson : schedule) {
            System.out.printf("%d.%s\n", counter, lesson);
            counter++;
        }
    }
}