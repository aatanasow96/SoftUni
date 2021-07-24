import java.util.Scanner;

public class RhombusOfStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int startCount=1; startCount <=n;startCount++) {
            printRow(n,startCount);
        }

        for (int startCount=n-1; startCount >=1;startCount--) {
            printRow(n,startCount);
        }
    }

    private static void printRow(int n, int startCount) {
        for (int i = 0; i <n-startCount ; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i < startCount; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
