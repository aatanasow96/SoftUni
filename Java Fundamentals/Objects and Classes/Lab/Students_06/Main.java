package Objects_and_Classes.Lab.Students_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputData = input.split("\\s+");

            String firstName = inputData[0];
            String lastName = inputData[1];
            int age = Integer.parseInt(inputData[2]);
            String city = inputData[3];

            if (Student.doesExist(students, firstName, lastName)) {
                Student student = Student.getStudent(students, firstName, lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }

            input = scanner.nextLine();
        }
        String searchCity = scanner.nextLine();

        for (Student student : students) {
            if (searchCity.equals(student.getCity())) {
                System.out.printf("%s %s is %d years old\n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge());
            }
        }
    }
}
