package StudentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var scanner = new BufferedReader(new InputStreamReader(System.in));
        StudentSystem studentSystem = new StudentSystem();
        String input = scanner.readLine();
        while (!input.equals("Exit"))
        {
            String[] items = input.split("\\s+");
            String commandResult = studentSystem.ParseCommand(items);
            if (commandResult != null){
                System.out.println(commandResult);
            }
           input = scanner.readLine();
        }


    }
}
