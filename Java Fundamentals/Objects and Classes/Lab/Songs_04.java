package Objects_and_Classes.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    static class Songs{
        String typeList;
        String name;
        String time;

        public Songs(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Songs> list= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] songData = scanner.nextLine().split("_");
            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            Songs song = new Songs(typeList, name, time);
            list.add(song);
        }
        String command = scanner.nextLine();

        for (Songs songs : list) {
            if (command.equals(songs.getTypeList())) {
                System.out.println(songs.getName());
            } else if (command.equals("all")) {
                System.out.println(songs.getName());
            }
        }
    }
}
