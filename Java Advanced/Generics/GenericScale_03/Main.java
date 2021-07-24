package Generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scale<String> stringScale = new Scale<>("a", "c");
        System.out.println(stringScale.getHeavier());
    }
}
