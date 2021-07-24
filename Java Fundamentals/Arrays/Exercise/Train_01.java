package Arrays.Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] wagon = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            wagon[i] = num;
            System.out.print(wagon[i] + " ");
            sum += num;
        }
        System.out.print("\n" + sum);
    }
}
