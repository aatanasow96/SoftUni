package Objects_and_Classes.Exercise.Students_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String studentInfo = scanner.nextLine();
            String firstName = studentInfo.split("\\s+")[0];
            String lastName = studentInfo.split("\\s+")[1];
            double grade = Double.parseDouble(studentInfo.split("\\s+")[2]);
            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}