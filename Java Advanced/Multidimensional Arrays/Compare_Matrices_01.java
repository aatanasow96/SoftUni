import java.util.Arrays;
import java.util.Scanner;

public class Compare_Matrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        int[][] firstMatrix = new int[dimensions[0]][dimensions[1]];

        for (int row = 0; row < dimensions[0]; row++) {
            firstMatrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[][] secondMatrix = new int [dimensions[0]][dimensions[1]];

        for (int row = 0; row < dimensions[0]; row++) {
            secondMatrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        boolean areEqual = true;

        if (firstMatrix.length != secondMatrix.length) {
            areEqual = false;
        } else {
            for (int row = 0; row < firstMatrix.length; row++) {

                if (firstMatrix[row].length != secondMatrix[row].length) {
                    areEqual = false;
                    break;
                }

                for (int col = 0; col < firstMatrix[row].length; col++) {
                    if (firstMatrix[row][col] != secondMatrix[row][col]) {
                        areEqual = false;
                        break;
                    }
                }

                if (!areEqual) {
                    break;
                }
            }
        }

        String result = areEqual
                ? "equal"
                : "not equal";
        System.out.println(result);
    }
}
