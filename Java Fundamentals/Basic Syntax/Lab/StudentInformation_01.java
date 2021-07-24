package Basic_Syntax.Lab;

import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avgGrade = Double.parseDouble(scanner.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.02f", name, age, avgGrade);

        System.out.println(result);
    }
}
