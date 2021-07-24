package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NetherRealms_05 {
    static class Demon {
        private String name;
        private int health;
        private double damage;

        public Demon(String name, int health, double damage) {
            this.name = name;
            this.health = health;
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }

        public String getName() {
            return name;
        }

        public Double getDamage() {
            return damage;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexName = "[^\\d.+\\/*,-]*";
        String regexDamage = "([-]?[\\\\d]+[.]?[\\\\d]*)";
        Pattern namePattern = Pattern.compile(regexName);
        Pattern damagePattern = Pattern.compile(regexDamage);

        String input = scanner.nextLine();
        String[] demons = input.split(", ");
        List<Demon> demonList = new ArrayList<>();

        for (String name : demons) {
            Matcher matcherName = namePattern.matcher(name);
            StringBuilder nameBuilder = new StringBuilder();
            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }
            String demonName = nameBuilder.toString();
            int health = 0;
            for (int i = 0; i < demonName.length(); i++) {
                health += demonName.charAt(i);
            }

            Matcher matcherDamage = damagePattern.matcher(name);
            double damage = 0;
            while (matcherDamage.find()) {
                damage += Double.parseDouble(matcherDamage.group());
            }

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '*') {
                    damage *= 2;
                } else if (input.charAt(i) == '/') {
                    damage /= 2;
                }
            }

            Demon demon = new Demon(name.replaceAll(" ",""), health, damage);
            demonList.add(demon);
        }

        demonList.stream().sorted(Comparator.comparing(Demon::getName))
                .forEach(demon -> System.out.printf("%s - %d health, %.2f damage\n",
                        demon.getName(),
                        demon.getHealth(),
                        demon.getDamage()));
    }
}