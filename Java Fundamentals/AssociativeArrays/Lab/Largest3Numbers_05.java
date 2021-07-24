package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Largest3Numbers_05 {
    public static void main(String[] args) {
        Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted(Comparator.reverseOrder())
                .limit(3).forEach(i -> System.out.print(i + " "));
    }
}