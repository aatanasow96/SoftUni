import java.util.*;

public class AverageStudentGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> grades = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String studentName = input[0];
            Double grade = Double.parseDouble(input[1]);

            if (!grades.containsKey(studentName))
            {
                grades.putIfAbsent(studentName,new ArrayList<>());
            }
            grades.get(studentName).add(grade);
        }

        for (Map.Entry<String,List<Double>> entry : grades.entrySet())
        {
            double average = calvAverage(entry.getValue());
            System.out.printf("%s -> ",entry.getKey());
            for (double value : entry.getValue())
            {
                System.out.printf("%.2f ",value);
            }
            System.out.printf("(avg: %.2f)%n",average);
        }

    }

    static double calvAverage(List<Double> values)
    {
        double result = 0;
        for (Double value : values)
        {
            result+=value;
        }
        return result/values.size();
    }
}
