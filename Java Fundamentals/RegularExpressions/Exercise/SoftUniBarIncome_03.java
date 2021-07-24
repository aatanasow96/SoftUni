package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern order = Pattern.compile(regex);

        String input = scanner.nextLine();
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = order.matcher(input);
            while (matcher.find()) {
                int count = Integer.parseInt(matcher.group("count"));
                double singularPrice = Double.parseDouble(matcher.group("price"));
                double price = count * singularPrice;

                System.out.printf("%s: %s - %.2f\n",
                        matcher.group("customer"),
                        matcher.group("product"),
                        price);
                totalIncome += price;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
