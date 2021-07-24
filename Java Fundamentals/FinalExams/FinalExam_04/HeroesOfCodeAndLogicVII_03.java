package FinalExams.FinalExam_04;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, Heroes> party = new HashMap<>();
        for (int i = 0; i < numberOfHeroes; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String heroName = input[0];
            int health = Integer.parseInt(input[1]);
            int mana = Integer.parseInt(input[2]);

            Heroes hero = new Heroes(heroName, health, mana);
            party.put(heroName, hero);
        }

        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            String[] commands = input.split(" - ");
            String heroName = commands[1];
            Heroes hero = party.get(heroName);
            switch (commands[0]) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commands[2]);
                    String spellName = commands[3];
                    Heroes.castSpell(hero, mpNeeded, spellName);
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commands[2]);
                    String attacker = commands[3];
                    Heroes.takeDamage(party, hero, damage, attacker);
                    break;
                case "Recharge":
                    int amountMP = Integer.parseInt(commands[2]);
                    int currentMana = hero.getMp();
                    Heroes.recharge(hero, amountMP, currentMana);
                    break;
                case "Heal":
                    int amountHP = Integer.parseInt(commands[2]);
                    int currentHealth = hero.getHp();
                    Heroes.heal(heroName, hero, amountHP, currentHealth);
                    break;
            }
        }

        party.values().stream()
                .sorted(Comparator.comparing(Heroes::getHp)
                        .reversed()
                        .thenComparing(Heroes::getName))
                .forEach(hero -> {
                    System.out.println(hero.getName());
                    System.out.printf("  HP: %d\n", hero.getHp());
                    System.out.printf("  MP: %d\n", hero.getMp());
                });
    }

    public static class Heroes {
        String name;
        int hp;
        int mp;

        public Heroes(String name, int hp, int mp) {
            this.name = name;
            this.hp = hp;
            this.mp = mp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getMp() {
            return mp;
        }

        public void setMp(int mp) {
            this.mp = mp;
        }

        private static void castSpell(Heroes hero, int mpNeeded, String spellName) {
            if (mpNeeded > hero.getMp()) {
                System.out.printf("%s does not have enough MP to cast %s!\n", hero.getName(), spellName);
            } else {
                hero.setMp(hero.getMp() - mpNeeded);
                System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                        hero.getName(), spellName, hero.getMp());
            }
        }

        private static void takeDamage(Map<String, Heroes> party, Heroes hero, int damage, String attacker) {
            hero.setHp(hero.getHp() - damage);

            if (hero.getHp() > 0) {
                System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                        hero.getName(), damage, attacker, hero.getHp());
            } else {
                System.out.printf("%s has been killed by %s!\n", hero.getName(), attacker);
                party.remove(hero.getName());
            }
        }

        private static void recharge(Heroes hero, int amountMP, int currentMana) {
            hero.setMp(hero.getMp() + amountMP);

            if (hero.getMp() > 200) {
                hero.setMp(200);
                System.out.printf("%s recharged for %d MP!\n", hero.getName(), 200 - currentMana);
            } else {
                System.out.printf("%s recharged for %d MP!\n", hero.getName(), amountMP);
            }
        }

        private static void heal(String heroName, Heroes hero, int amountHP, int currentHealth) {
            hero.setHp(hero.getHp() + amountHP);

            if (hero.getHp() > 100) {
                hero.setHp(100);
                System.out.printf("%s healed for %d HP!\n", heroName, 100 - currentHealth);
            } else {
                System.out.printf("%s healed for %d HP!\n", heroName, amountHP);
            }
        }
    }
}