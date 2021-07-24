package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingUsers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];
            String user = input.split("\\s+")[1];

            switch (command) {
                case "register":
                    String licensePlate = input.split("\\s+")[2];
                    registerUser(parkingUsers, user, licensePlate);
                    break;
                case "unregister":
                    unregisterUser(parkingUsers, user);
                    break;
            }
        }

        for (Map.Entry<String, String> entry : parkingUsers.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }

    private static void registerUser(Map<String, String> parkingUsers, String user, String licensePlate) {
        if (parkingUsers.containsKey(user)) {
            System.out.println("ERROR: already registered with plate number " + parkingUsers.get(user));
        } else {
            parkingUsers.put(user, licensePlate);
            System.out.printf("%s registered %s successfully\n", user, licensePlate);
        }
    }

    private static void unregisterUser(Map<String, String> parkingUsers, String user) {
        if (parkingUsers.containsKey(user)) {
            parkingUsers.remove(user);
            System.out.println(user + " unregistered successfully");
        } else {
            System.out.printf("ERROR: user %s not found\n", user);
        }
    }
}
