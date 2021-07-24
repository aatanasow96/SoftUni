package FinalExams.FinalExam_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "(\\@\\#+)(?<barcode>[A-Z]{1}[A-Za-z0-9]{4,}[A-Z]{1})(\\@\\#+)";
        Pattern barcodePattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = barcodePattern.matcher(input);

            if (matcher.find()) {
                String barcode = matcher.group();
                Pattern digits = Pattern.compile("\\d");
                Matcher digitMatcher = digits.matcher(barcode);

                System.out.print("Product group: ");
                if (digitMatcher.find()) {
                    System.out.print(digitMatcher.group());
                    while (digitMatcher.find()) {
                        System.out.print(digitMatcher.group());
                    }
                    System.out.println();
                } else
                    System.out.print("00\n");
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
