package AssociativeArrays.Exercise;

import java.util.*;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new HashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();

        while (canCraft(keyMaterials)) {
            String input = scanner.nextLine();
            for (int i = 0; i < input.split("\\s+").length; i += 2) {
                int quantity = Integer.parseInt(input.split("\\s+")[i]);
                String material = input.split("\\s+")[i + 1].toLowerCase();

                switch (material) {
                    case "shards":
                        keyMaterials.put("shards", keyMaterials.get("shards") + quantity);
                        break;
                    case "fragments":
                        keyMaterials.put("fragments", keyMaterials.get("fragments") + quantity);
                        break;
                    case "motes":
                        keyMaterials.put("motes", keyMaterials.get("motes") + quantity);
                        break;
                    default:
                        junk.putIfAbsent(material, 0);
                        junk.put(material, junk.get(material) + quantity);
                        break;
                }
            }
        }

        craft(keyMaterials);
        keyMaterials.entrySet().stream().
                sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));

        junk.entrySet().stream().
        sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
    }

    private static void craft(Map<String, Integer> keyMaterials) {
        if (keyMaterials.get("shards") >= 250) {
            System.out.println("Shadowmourne obtained!");
            keyMaterials.put("shards", keyMaterials.get("shards") - 250);
        } else if (keyMaterials.get("fragments") >= 250) {
            System.out.println("Valanyr obtained!");
            keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
        } else if (keyMaterials.get("motes") >= 250) {
            System.out.println("Dragonwrath obtained!");
            keyMaterials.put("motes", keyMaterials.get("motes") - 250);
        }
    }

    private static boolean canCraft(Map<String, Integer> keyMaterials) {
        return keyMaterials.get("shards") <= 250
                && keyMaterials.get("fragments") <= 250
                && keyMaterials.get("motes") <= 250;
    }
}
