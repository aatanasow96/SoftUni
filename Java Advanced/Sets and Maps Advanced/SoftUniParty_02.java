import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        TreeSet<String> guests = new TreeSet<>();

        while (!"PARTY".equals(input = scanner.nextLine())) {
            guests.add(input);
        }

        while (!"END".equals(input = scanner.nextLine())) {
            guests.remove(input);
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
