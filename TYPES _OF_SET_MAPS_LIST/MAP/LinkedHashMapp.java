package MAP;
//Order of insertion 
//Contains hash table and the doubly linked list
//alows one null key 
//Multiple  null vales 
import java.util.*;
public class LinkedHashMapp {
  public static void main(String[] args) {
        // 1. Create a LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 2. Add key-value pairs
        map.put(1, "Apple");
        map.put(3, "Mango");
        map.put(2, "Banana");
        map.put(4, "Apple"); // Duplicate value allowed
        map.put(3, "Grapes"); // Key 3 updated

        // 3. Print the map (in insertion order)
        System.out.println("LinkedHashMap: " + map);

        // 4. Access elements
        System.out.println("Value for key 2: " + map.get(2));

        // 5. Check key/value existence
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // 6. Remove a key
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // 7. Size and empty check
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());

        // 8. Iterate through keys, values, entries
        System.out.println("\nIterating with for-each:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 9. Clear the map
        map.clear();
        System.out.println("After clear(): " + map);
    }
  
}
