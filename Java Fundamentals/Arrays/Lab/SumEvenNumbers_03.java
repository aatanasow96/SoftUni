package Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        String[] arr = new Scanner(System.in).nextLine().split(" ");
        int[] arrToNum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrToNum[i] = Integer.parseInt(arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrToNum[i] % 2 == 0) {
                sum += arrToNum[i];
            }
        }
        System.out.println(sum);
    }
}
