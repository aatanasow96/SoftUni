import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == n) {
                    isFound = true;
                    System.out.printf("%d %d\n", row, col);
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] dimensions = readArray(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner);
        }

        return matrix;
    }
}
