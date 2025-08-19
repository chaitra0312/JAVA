import java.util.*;
class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hope");
        list.add("Baby");
        list.add("Day light");
        list.add("Lover");
        list.add("No one");

        // Insert song at index 2
        list.add(2, "Nothing");

        // Print only updated list
        System.out.println("Updated Song List:");
        for (String song : list) {
            System.out.println(song);
        }
    }
}
