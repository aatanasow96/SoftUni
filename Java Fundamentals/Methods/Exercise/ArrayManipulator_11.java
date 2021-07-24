package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] input = command.split(" ");
            String type = input[0];
            switch (type) {
                case "exchange":
                    break;
                case "max":
                    if (input[1].equals("even")) {
                        printMaxEvenIndex(arr);
                    } else if (input[1].equals("odd")) {
                        printMaxOddIndex(arr);
                    }
                    break;
                case "min":
                    if (input[1].equals("even")) {
                        printMinEvenIndex(arr);
                    } else if (input[1].equals("odd")) {
                        printMinOddIndex(arr);
                    }
                    break;
                case "first":
                    if (input[2].equals("even")) {
                        int count = Integer.parseInt(input[1]);
                        printFirstEvenNumbers(arr, count);
                    } else if (input[2].equals("odd")) {
                        int count = Integer.parseInt(input[1]);
                        printFirstOddNumbers(arr, count);
                    }
                    break;
                case "last":
                    if (input[2].equals("even")) {
                        int count = Integer.parseInt(input[1]);
                        printLastEvenNumbers(arr, count);
                    } else if (input[2].equals("odd")) {
                        int count = Integer.parseInt(input[1]);
                        printLastOddNumbers(arr, count);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }

    static void printMaxEvenIndex(int[] arr) {
        int maxEvenIndex = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && i >= maxEvenIndex) {
                maxEvenIndex = i;
            }
        }
        if (maxEvenIndex != Integer.MIN_VALUE) {
            System.out.println(maxEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printMaxOddIndex(int[] arr) {
        int maxOddIndex = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && i >= maxOddIndex) {
                maxOddIndex = i;
            }
        }
        if (maxOddIndex != Integer.MIN_VALUE) {
            System.out.println(maxOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printMinEvenIndex(int[] arr) {
        int minEvenIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && i <= minEvenIndex) {
                minEvenIndex = i;
            }
        }
        if (minEvenIndex != Integer.MAX_VALUE) {
            System.out.println(minEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printMinOddIndex(int[] arr) {
        int minOddIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0 && i <= minOddIndex) {
                minOddIndex = i;
            }
        }
        if (minOddIndex != Integer.MAX_VALUE) {
            System.out.println(minOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printFirstEvenNumbers(int[] arr, int count) {
        if (count > arr.length) {
            System.out.println("Invalid count");
        } else if (count == 0) {
            System.out.println("[]");
        }
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers.append(arr[i]).append(" ");
            }
        }
        String[] result = evenNumbers.toString().split(" ");
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == result.length - 1) {
                System.out.print(result[i] + "]");
            } else {
                System.out.print(result[i] + ", ");
            }
        }
    }

    static void printFirstOddNumbers(int[] arr, int count) {
        if (count > arr.length) {
            System.out.println("Invalid count");
        } else if (count == 0) {
            System.out.println("[]");
        }
        StringBuilder oddNumbers = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbers.append(arr[i]).append(" ");
            }
        }
        String[] result = oddNumbers.toString().split(" ");
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == result.length - 1) {
                System.out.print(result[i] + "]");
            } else {
            System.out.print(result[i] + ", ");
            }
        }
    }

    static void printLastEvenNumbers(int[] arr, int count) {
        if (count > arr.length) {
            System.out.println("Invalid count");
        } else if (count == 0) {
            System.out.println("[]");
        }
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                evenNumbers.append(arr[i]).append(" ");
            }
        }
        String[] result = evenNumbers.toString().split(" ");
        for (int i = 0; i < result.length - 1; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == result.length - 1) {
                System.out.print(result[i] + "]");
            } else {
                System.out.print(result[i] + ", ");
            }
        }
    }

    static void printLastOddNumbers(int[] arr, int count) {
        if (count > arr.length) {
            System.out.println("Invalid count");
        } else if (count == 0) {
            System.out.println("[]");
        }
        StringBuilder oddNumbers = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                oddNumbers.append(arr[i]).append(" ");
            }
        }
        String[] result = oddNumbers.toString().split(" ");
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == count - 1) {
                System.out.print(result[i] + "]");
            } else {
                System.out.print(result[i] + ", ");
            }
        }
    }
}
