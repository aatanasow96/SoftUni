package Arrays.Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i]; // a
            input[i] = input[input.length - 1 - i]; // a = e
            input[input.length - 1 - i] = temp;
        }
        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}
