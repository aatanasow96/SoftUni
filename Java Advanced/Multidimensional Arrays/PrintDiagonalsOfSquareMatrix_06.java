import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }
        int col = 0;
        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][col++] + " ");
        }

        System.out.println();
        int col2 = 0;
        for (int row = n - 1; row >= 0; row--) {
            System.out.print(matrix[row][col2++] + " ");
        }
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
