package Methods.Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        signOfInt(scanner.nextInt());
    }

    static void signOfInt(int num){
        if (num == 0) {
            System.out.printf("The number %d is zero.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is negative.", num);
        }
    }
}