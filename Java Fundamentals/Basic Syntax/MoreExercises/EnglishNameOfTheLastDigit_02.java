package Basic_Syntax.MoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(englishNameLastDigit(n));
    }

    static String englishNameLastDigit(int n) {
        n %= 10;
        String englishName = "";

        switch (n){
            case 0:
                englishName = "zero";
                break;
            case 1:
                englishName = ("one");
                break;
            case 2:
                englishName = ("two");
                break;
            case 3:
                englishName = "three";
                break;
            case 4:
                englishName = "four";
                break;
            case 5:
                englishName = "five";
                break;
            case 6:
                englishName = "six";
                break;
            case 7:
                englishName = "seven";
                break;
            case 8:
                englishName = "eight";
                break;
            case 9:
                englishName = "nine";
                break;
        }
        return englishName;
    }
}
