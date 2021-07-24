package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");
        Map<String, Integer> participants = new LinkedHashMap<>();
        for (String name : names) {
            participants.put(name, 0);
        }

        String regexName = "[A-Za-z]+";
        String regexDistance = "\\d";
        Pattern nameInfo = Pattern.compile(regexName);
        Pattern distanceInfo = Pattern.compile(regexDistance);
        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            Matcher matcherName = nameInfo.matcher(input);
            StringBuilder participant = new StringBuilder();
            while (matcherName.find()) {
                participant.append(matcherName.group());
            }
            String name = participant.toString();

            Matcher matcherDistance = distanceInfo.matcher(input);
            int distance = 0;
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            if (participants.containsKey(name)) {
                participants.put(name, participants.get(name) + distance);
            }

            input = scanner.nextLine();
        }

        List<String> result = participants.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                limit(3).
                map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("1st place: " + result.get(0));
        System.out.println("2nd place: " + result.get(1));
        System.out.println("3rd place: " + result.get(2));
    }
}
