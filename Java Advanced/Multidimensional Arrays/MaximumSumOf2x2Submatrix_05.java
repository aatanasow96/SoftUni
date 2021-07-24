import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner, ", ");

        int maxSum = Integer.MIN_VALUE;
        int[][] maxSumMatrix = new int[2][2];

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = 0;
                sum += matrix[row][col];
                sum += matrix[row][col + 1];
                sum += matrix[row + 1][col];
                sum += matrix[row + 1][col + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumMatrix[0] = new int[]{matrix[row][col], matrix[row][col + 1]};
                    maxSumMatrix[1] = new int[]{matrix[row + 1][col], matrix[row + 1][col + 1]};
                }
            }
        }

        for (int[] row : maxSumMatrix) {
            for (int col = 0; col < row.length; col++) {
                System.out.print(row[col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] readMatrix(Scanner scanner, String pattern) {
        int[] dimensions = readArray(scanner, pattern);

        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner, pattern);
        }

        return matrix;
    }
}
