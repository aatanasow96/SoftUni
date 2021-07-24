import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Product>> map = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String[] items = input.split(", ");
            String storeName = items[0];
            String productName = items[1];
            double productPrice = Double.parseDouble(items[2]);
            Product p = new Product(productName, productPrice);

            if (!map.containsKey(storeName)) {
                map.putIfAbsent(storeName, new ArrayList<>());
            }

            map.get(storeName).add(p);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            for (Product p : entry.getValue()) {
                System.out.printf("Product: %s, Price: %.1f%n", p.getName(), p.getPrice());
            }
        }
    }
}

class Product {
    public String name;
    public double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
