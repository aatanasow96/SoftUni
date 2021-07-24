package Arrays.Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String elementsOfSecondArray : secondArray) {
            for (String elementsOfFirstArray : firstArray) {
                if (elementsOfSecondArray.equals(elementsOfFirstArray)) {
                    System.out.print(elementsOfSecondArray + " ");
                }
            }
        }
    }
}
