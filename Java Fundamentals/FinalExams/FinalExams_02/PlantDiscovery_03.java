package FinalExams_02;

import java.util.*;


public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Plants> plantsMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String plantName = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);

            Plants plant = new Plants(plantName);
            plantsMap.putIfAbsent(plantName, plant);
            plant.setRarity(rarity);
        }

        String commands;
        while (!"Exhibition".equals(commands = scanner.nextLine())) {
            String[] tokens = commands.split(": ");
            String[] token = tokens[1].split(" - ");

            String command = tokens[0];
            String plant = token[0];

            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(token[1]);
                    plantsMap.get(plant).setRatingSum(plantsMap.get(plant).getRatingSum() + rating);
                    plantsMap.get(plant).setRatingCount(plantsMap.get(plant).getRatingCount() + 1);
                    break;
                case "Update":
                    int rarity = Integer.parseInt(token[1]);
                    plantsMap.get(plant).setRarity(rarity);
                    break;
                case "Reset":
                    plantsMap.get(plant).setRatingSum(0);
                    plantsMap.get(plant).setRatingCount(0);
                    break;
                default:
                    System.out.println("error");
            }
        }

        System.out.println("Plants for the exhibition:");
        plantsMap.values().stream()
                .sorted(Comparator.comparing(Plants::getRarity)
                      //  .reversed()
                        .thenComparing((Plants p) -> p.getRatingSum() / p.getRatingCount())
                        .reversed()
                )
                .forEach(p -> {
                    if (p.getRatingSum() == 0 && p.getRatingCount() == 0) {
                        System.out.printf("- %s; Rarity: %d; Rating: 0.00\n"
                                , p.getPlant()
                                , p.getRarity());
                    } else {
                        System.out.printf("- %s; Rarity: %d; Rating: %.2f\n"
                                , p.getPlant()
                                , p.getRarity()
                                , p.getRatingSum() / p.getRatingCount());
                    }
                });
    }

    static class Plants {
        private String plant;
        private int rarity;
        private double ratingSum;
        private int ratingCount;

        public Plants(String plant) {
            this.plant = plant;
            this.rarity = 0;
            this.ratingSum = 0;
            this.ratingCount = 0;
        }

        public String getPlant() {
            return plant;
        }

        public void setPlant(String plant) {
            this.plant = plant;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public int getRatingCount() {
            return ratingCount;
        }

        public void setRatingCount(int ratingCount) {
            this.ratingCount = ratingCount;
        }

        public double getRatingSum() {
            return ratingSum;
        }

        public void setRatingSum(double ratingSum) {
            this.ratingSum = ratingSum;
        }

//        @Override
//
//        public String toString() {
//            return String.format("- %s; Rarity: %d; Rating: %.2f"
//                    , getPlant()
//                    , getRarity()
//                    , getRatingSum() / getRatingCount());
//        }
    }
}
