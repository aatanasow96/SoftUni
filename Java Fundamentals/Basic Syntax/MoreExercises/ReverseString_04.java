package Basic_Syntax.MoreExercises;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println(reversed);
    }
}
