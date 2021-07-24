import java.util.LinkedHashSet;
import java.util.Scanner;

    public class ParkingLot_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;
            LinkedHashSet<String> regPlates = new LinkedHashSet<>();

            while (!"END".equals(input = scanner.nextLine())) {
                String[] carInfo = input.split(", ");

                switch (carInfo[0]) {
                    case "IN":
                        regPlates.add(carInfo[1]);
                        break;
                    case "OUT":
                        regPlates.remove(carInfo[1]);
                        break;
                }
            }

            if (regPlates.isEmpty()) {
                System.out.println("Parking Lot is Empty");
            } else {
                for (String regPlate : regPlates) {
                    System.out.println(regPlate);
                }
            }
        }
    }