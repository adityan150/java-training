package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store Integer vs String
        Map<Integer, String> map = new HashMap<>();

        // adding values in the HashMap
        map.put(1, "Aditya");
        map.put(2, "Abhinav");
        map.put(3, "Anirudh");
        map.put(4, "Akash");

        // Displaying the contents of the HashMap
        printMap(map);

        // Updating the values in map
        map.put(2, "Saksham");

        // Putting a value only if it is absent
        if (map.get(5) == null) {
            map.put(5, "Priyanshu");
        }

        // A better way to do the same
        map.putIfAbsent(5, "Ritik");

        // Retrieving values from the map
        System.out.println("Value for the key = 3 is : " + map.get(3));

        // If the key is not present, null is returned.
        // To get a default value if key is absent
        System.out.println("Value for key = 10 is : " +
                map.getOrDefault(10, "Not Present"));

        // Displaying the contents again
        printMap(map);
    }

    static void printMap(Map<Integer, String> map) {
        System.out.println("HashMap : ");
        System.out.println("Key\t\tValue");
        System.out.println("____________________________");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + "\t\t" + e.getValue());
        }
        System.out.println("\n");
    }
}
