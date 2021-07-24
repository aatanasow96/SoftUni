package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String productName = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            if (!productPrice.containsKey(productName)) {
                productPrice.put(productName, price);
                productQuantity.put(productName, quantity);
            } else {
                productPrice.put(productName, price);
                productQuantity.put(productName, productQuantity.get(productName) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> product : productPrice.entrySet()) {
            double finalSum = product.getValue() * productQuantity.get(product.getKey());
            System.out.printf("%s -> %.2f\n", product.getKey(), finalSum);
        }
    }
}
