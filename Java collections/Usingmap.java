import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 3, 4, 3, 5, 6);

        // Step 1: Count occurrences
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find first non-repeating
        Integer firstUnique = null;
        for (int num : list) {
            if (map.get(num) == 1) {
                firstUnique = num;
                break;
            }
        }

        // Output
        if (firstUnique != null) {
            System.out.println("First non-repeating: " + firstUnique);
        } else {
            System.out.println("No unique elements found.");
        }
    }
}
