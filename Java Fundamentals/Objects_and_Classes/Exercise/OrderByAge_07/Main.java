package Objects_and_Classes.Exercise.OrderByAge_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<People> peopleList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String name = input.split("\\s+")[0];
            String ID = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            People person = new People(name, ID, age);
            peopleList.add(person);

            input = scanner.nextLine();
        }

        peopleList.sort(Comparator.comparing(People::getAge));
        for (People people : peopleList) {
            System.out.println(people);
        }
    }
}