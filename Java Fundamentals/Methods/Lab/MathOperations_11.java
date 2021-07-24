package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.#####")
                .format(calculate(firstNum,operator,secondNum)));
    }

    static double calculate(int firstNum, String operator, int secondNum) {
        double result = 0;
        switch (operator){
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = (double) firstNum / secondNum;
                break;
        }

        return result;
    }
}
