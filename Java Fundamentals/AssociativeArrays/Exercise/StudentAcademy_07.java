package AssociativeArrays.Exercise;

import java.util.*;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentAvgGrade = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            studentAvgGrade.putIfAbsent(studentName, new ArrayList<>());
            studentAvgGrade.get(studentName).add(studentGrade);
        }
        Map<String, Double> averageGrade = new HashMap<>();

        for (Map.Entry<String, List<Double>> student : studentAvgGrade.entrySet()) {
            double avgGrade = student.getValue().stream().mapToDouble(s -> s).average().getAsDouble();
            if (avgGrade >= 4.50) {
                averageGrade.put(student.getKey(), avgGrade);
            }
        }

        averageGrade.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(student -> System.out.printf("%s -> %.2f\n", student.getKey(), student.getValue()));
    }
}
