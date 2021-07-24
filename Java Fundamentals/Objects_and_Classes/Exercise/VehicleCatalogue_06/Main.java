package Objects_and_Classes.Exercise.VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalogue> vehicles = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsePower = Integer.parseInt(input.split("\\s+")[3]);

            Catalogue vehicle = new Catalogue(model, color, horsePower);
            if (type.equals("car")) {
                vehicle.setType("Car");
            } else if (type.equals("truck")) {
                vehicle.setType("Truck");
            }
            vehicles.add(vehicle);
            input = scanner.nextLine();
        }

        String models = scanner.nextLine();
        while (!models.equals("Close the Catalogue")) {
            for (Catalogue vehicle : vehicles) {
                if (models.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                }
            }
            models = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", Catalogue.getAvgCarHorsePower(vehicles));
        System.out.printf("Trucks have average horsepower of: %.2f.\n", Catalogue.getAvgTruckHorsePower(vehicles));
    }
}