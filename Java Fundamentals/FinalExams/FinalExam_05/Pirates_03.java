package FinalExams.FinalExam_05;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    static class City {
        String name;
        int population;
        int gold;

        public City(String name) {
            this.name = name;
            this.population = 0;
            this.gold = 0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, City> cities = new HashMap<>();

        while (!input.equals("Sail")) {
            String[] cityInfo = input.split("\\|\\|");
            String cityName = cityInfo[0];
            int population = Integer.parseInt(cityInfo[1]);
            int gold = Integer.parseInt(cityInfo[2]);

            cities.putIfAbsent(cityName, new City(cityName));
            City city = cities.get(cityName);
            city.setPopulation(city.getPopulation() + population);
            city.setGold(city.getGold() + gold);

            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();
        while (!input2.equals("End")) {
            String[] event = input2.split("=>");
            String town = event[1];
            City city = cities.get(town);
            switch (event[0]) {
                case "Plunder":
                    int people = Integer.parseInt(event[2]);
                    int goldStolen = Integer.parseInt(event[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",
                            town,
                            goldStolen,
                            people);

                    city.setPopulation(city.getPopulation() - people);
                    city.setGold(city.getGold() - goldStolen);

                    if (city.getPopulation() <= 0 || city.getGold() <= 0) {
                        System.out.printf("%s has been wiped off the map!\n", town);
                        cities.remove(town);
                    }
                    break;
                case "Prosper":
                    int gold = Integer.parseInt(event[2]);

                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        city.setGold(city.getGold() + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",
                                gold,
                                town,
                                city.getGold());
                    }
                    break;
            }
            input2 = scanner.nextLine();
        }

        if (!cities.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",
                    cities.size());

            cities.values().stream()
                    .sorted(Comparator.comparing(City::getGold)
                            .reversed()
                            .thenComparing(City::getName))
                    .forEach(city -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",
                            city.getName(),
                            city.getPopulation(),
                            city.getGold()));

        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}