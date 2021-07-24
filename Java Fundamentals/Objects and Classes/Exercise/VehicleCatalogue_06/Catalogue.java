package Objects_and_Classes.Exercise.VehicleCatalogue_06;

import java.util.List;

public class Catalogue {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Catalogue(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setType(String type) {
        this.type = type;
    }

    static double getAvgCarHorsePower(List<Catalogue> vehicles){
        int carHorsePower = 0;
        int carCount = 0;

        for (Catalogue vehicle : vehicles) {
            if (vehicle.getType().equals("Car")) {
                carHorsePower += vehicle.getHorsePower();
                carCount++;
            }
        }

        if (carHorsePower == 0) {
            return 0;
        } else {
            return (double) carHorsePower / carCount;
        }
    }

    static double getAvgTruckHorsePower(List<Catalogue> vehicles){
        int truckHorsePower = 0;
        int truckCount = 0;

        for (Catalogue vehicle : vehicles) {
            if (vehicle.getType().equals("Truck")) {
                truckHorsePower += vehicle.getHorsePower();
                truckCount++;
            }
        }

        if (truckHorsePower == 0) {
            return 0;
        } else {
            return (double) truckHorsePower / truckCount;
        }
    }

    @Override
    public String toString(){
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d",
                getType(),
                getModel(),
                getColor(),
                getHorsePower());
    }
}