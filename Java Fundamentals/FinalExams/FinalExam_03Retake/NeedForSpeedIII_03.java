package FinalExams.FinalExam_03Retake;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Cars> carsMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            int mileage = Integer.parseInt(carInfo[1]);
            int fuel = Integer.parseInt(carInfo[2]);
            Cars car = new Cars(carInfo[0], mileage, fuel);
            carsMap.put(carInfo[0], car);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] commands = input.split(" : ");
            String carModel = commands[1];

            switch (commands[0]) {
                case "Drive":
                    int distance = Integer.parseInt(commands[2]);
                    int fuel = Integer.parseInt(commands[3]);
                    drive(carsMap, carModel, distance, fuel);
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(commands[2]);
                    refuel(carsMap, carModel, refuel);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(commands[2]);
                    revert(carsMap, carModel, kilometers);
                    break;

            }
            input = scanner.nextLine();
        }

        carsMap.values().stream()
                .sorted(Comparator.comparing(Cars::getMileage).reversed()
                .thenComparing(Cars::getCar))
                .forEach(System.out::println);
    }

    private static void revert(Map<String, Cars> carsMap, String carModel, int km) {
        Cars car = carsMap.get(carModel);

        if (car.getMileage() - km < 10000) {
            car.setMileage(10000);
        } else {
            car.setMileage(car.getMileage() - km);
            System.out.printf("%s mileage decreased by %d kilometers\n", carModel, km);
        }
    }

    private static void refuel(Map<String, Cars> carsMap, String carModel, int fuel) {
        Cars car = carsMap.get(carModel);
        int currentFuel = car.getFuel();

        if (car.getFuel() + fuel > 75) {
            car.setFuel(75);
            System.out.printf("%s refueled with %d liters\n", carModel, 75 - currentFuel);
        } else {
            car.setFuel(car.getFuel() + fuel);
            System.out.printf("%s refueled with %d liters\n", carModel, fuel);
        }
    }

    private static void drive(Map<String,Cars> carsMap, String carModel, int distance, int fuel) {
        Cars car = carsMap.get(carModel);

        if (car.getFuel() - fuel< 0) {
            System.out.println("Not enough fuel to make that ride");
        } else {
            car.setMileage(car.getMileage() + distance);
            car.setFuel(car.getFuel() - fuel);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",
                    carModel,
                    distance,
                    fuel);
        }

        if (car.getMileage() >= 100000) {
            carsMap.remove(carModel);
            System.out.printf("Time to sell the %s!\n", carModel);
        }
    }

    public static class Cars {
        private String car;
        private int mileage;
        private int fuel;

        public Cars(String car, int mileage, int fuel) {
            this.car = car;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getCar() {
            return car;
        }

        public void setCar(String car) {
            this.car = car;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return getCar() +" -> Mileage: " + getMileage() +" kms, Fuel in the tank: " + getFuel() + " lt.";
        }
    }
}