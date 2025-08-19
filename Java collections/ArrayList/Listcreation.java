import java.util.*;

class Demo {
    public static void main(String[] args) {
        // Creating a playlist
        ArrayList<String> list = new ArrayList<>();
        list.add("Hope");
        list.add("Baby");
        list.add("Daylight");
        list.add("Lover");
        list.add("No One");

        // Print using for loop
        System.out.println("Playlist using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Song " + (i + 1) + ": " + list.get(i));
        }

        // Print using foreach loop
        System.out.println("\nPlaylist using foreach loop:");
        for (String song : list) {
            System.out.println("Song: " + song);
        }
    }
}
