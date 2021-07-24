package Objects_and_Classes.Exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int messages = Integer.parseInt(scanner.nextLine());
        Random random = new Random();
        for (int i = 0; i < messages; i++) {
            int randomPhrase = random.nextInt(phrases.length);
            int randomEvent = random.nextInt(events.length);
            int randomAuthor = random.nextInt(authors.length);
            int randomCity = random.nextInt(city.length);

            System.out.printf("%s %s %s - %s\n", phrases[randomPhrase], events[randomEvent], authors[randomAuthor],
                    city[randomCity]);
        }
    }
}
