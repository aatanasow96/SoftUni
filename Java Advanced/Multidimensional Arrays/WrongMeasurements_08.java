import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int[] wrongValueIndexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int wrongValue = matrix[wrongValueIndexes[0]][wrongValueIndexes[1]];
        int[][] resultMatrix = new int[rows][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    int sum = getSum(matrix, row, col, wrongValue);
                    resultMatrix[row][col] = sum;
                } else {
                    resultMatrix[row][col] = matrix[row][col];
                }
            }
        }

        for (int[] arr : resultMatrix) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix, int row, int col, int wrongValue) {
        int sum = 0;
        if (row - 1 >= 0 && matrix[row - 1][col] != wrongValue) {
            sum += matrix[row - 1][col];
        }

        if (row + 1 < matrix.length && matrix[row + 1][col] != wrongValue) {
            sum += matrix[row + 1][col];
        }

        if (col + 1 < matrix[row].length && matrix[row][col + 1] != wrongValue) {
            sum += matrix[row][col + 1];
        }

        if (col - 1 >= 0 && matrix[row][col - 1] != wrongValue) {
            sum += matrix[row][col - 1];
        }

        return sum;
    }
}