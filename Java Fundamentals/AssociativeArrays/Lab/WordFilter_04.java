package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Arrays.stream(Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new)).forEach(System.out::println);
    }
}