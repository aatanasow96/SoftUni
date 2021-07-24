package TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String[] paths = path.split("\\\\");
        String file = paths[paths.length - 1];
        String fileName = file.split("\\.")[0];
        String extension = file.split("\\.")[1];

        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
