import java.util.*;

public class VoinaGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> player1 = new LinkedHashSet<>();
        Set<Integer> player2 = new LinkedHashSet<>();
        fillSet(player1,scanner);
        fillSet(player2,scanner);
        int rounds = 0;

        while(rounds++ < 50 && !player1.isEmpty() && !player2.isEmpty())
        {
            int first = player1.iterator().next();
            int second = player2.iterator().next();

            player1.remove(first);
            player2.remove(second);

            if (first>second)
            {
                player1.add(first);
                player1.add(second);
            }
            else if (second>first)
            {
                player2.add(first);
                player2.add(second);
            }
        }

        if (rounds==50 || player1.size() == player2.size())
        {
            System.out.println("Draw!");
        }
        else if (player1.size() < player2.size())
        {
            System.out.println("Second player win!");
        }
        else
            System.out.println("First player win!");
    }

    static void fillSet(Set<Integer> cards,Scanner scanner)
    {
        for (int i = 0; i < 20; i++) {
            int number=scanner.nextInt();
            cards.add(number);
        }
    }
}
