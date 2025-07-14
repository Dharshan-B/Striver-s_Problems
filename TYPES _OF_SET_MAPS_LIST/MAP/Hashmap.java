package MAP;
//Stores Key-Value pairs
//Keys must be unique
//Values can be duplicated
//Allows the one null and null values
//Unsorted
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
     public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Add entries (put)
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");
        map.put(102, "Grapes"); // Key 102 is overwritten

        // 3. Print the map
        System.out.println("HashMap: " + map);

        // 4. Access values
        System.out.println("Value for key 101: " + map.get(101));
        System.out.println("Value for key 105: " + map.get(105)); // null

        // 5. Check key and value existence
        System.out.println("Contains key 103? " + map.containsKey(103));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // 6. Remove entry by key
        map.remove(102);
        System.out.println("After removing key 102: " + map);

        // 7. Size of the map
        System.out.println("Size: " + map.size());

        // 8. Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // 9. Iterate over keys, values, entries
        System.out.println("\nIterating over keys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nIterating over values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("\nIterating over key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10. Clear the map
        map.clear();
        System.out.println("After clear(): " + map);
    }
  
}
