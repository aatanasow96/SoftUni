import java.util.Arrays;
import java.util.Scanner;

public class FindTheRealQueen_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'q') {
                    if (checkUp(matrix, row, col) &&
                            checkDown(matrix, row, col) &&
                            checkLeft(matrix, row, col) &&
                            checkRight(matrix, row, col) &&
                            checkNorthEast(matrix, row, col) &&
                            checkNorthWest(matrix, row, col) &&
                            checkSouthEast(matrix, row, col) &&
                            checkSouthWest(matrix, row, col)) {

                        System.out.println(row + " " + col);
                    }
                }
            }
        }
    }

    private static boolean checkSouthWest(char[][] matrix, int rows, int cols) {
        int row = rows + 1;
        int col = cols - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row++][col--] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSouthEast(char[][] matrix, int rows, int cols) {
        int row = rows + 1;
        int col = cols + 1;

        while (row < matrix.length && col < matrix.length) {
            if (matrix[row++][col++] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNorthWest(char[][] matrix, int rows, int cols) {
        int row = rows -1;
        int col = cols -1;

        while (row >= 0 && col >= 0) {
            if (matrix[row--][col--] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNorthEast(char[][] matrix, int rows, int cols) {
        int row = rows - 1;
        int col = cols + 1;

        while (row >= 0 && col < matrix.length) {
            if (matrix[row--][col++] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkRight(char[][] matrix, int rows, int cols) {
        for (int col = cols + 1; col < matrix.length; col++) {
            if (matrix[rows][col] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkLeft(char[][] matrix, int rows, int cols) {
        for (int col = cols - 1; col >= 0; col--) {
            if (matrix[rows][col] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkUp(char[][] matrix, int rows, int cols) {
        for (int row = rows - 1; row >= 0; row--) {
            if (matrix[row][cols] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDown(char[][] matrix, int rows, int cols) {
        for (int row = rows + 1; row < matrix.length; row++) {
            if (matrix[row][cols] == 'q') {
                return false;
            }
        }
        return true;
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
