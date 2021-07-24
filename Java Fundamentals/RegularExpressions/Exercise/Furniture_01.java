package RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<name>\\w+)<<(?<price>\\d+.?\\d+)!(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        double totalPrice = 0;
        List<String> purchases = new ArrayList<>();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                purchases.add(matcher.group("name"));
                totalPrice += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        purchases.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}