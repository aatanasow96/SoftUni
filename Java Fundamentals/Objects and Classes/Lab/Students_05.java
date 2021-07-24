package Objects_and_Classes.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student {
        private final String firstName;
        private final String lastName;
        private final int age;
        private final String city;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }
    }

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

            Student student = new Student(firstName, lastName, age, city);
            students.add(student);
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
