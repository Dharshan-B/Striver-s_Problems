package MAP;

import java.util.Map;
import java.util.TreeMap;

//Sorted order (Key - value pair)
//Uses Red - Black tree
//Does not allow Null Keys (THROWS the NullPointerException)
public class TreeMapp {
   public static void main(String[] args) {
        // 1. Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // 2. Add entries
        map.put(30, "Banana");
        map.put(10, "Apple");
        map.put(20, "Mango");
        map.put(40, "Grapes");

        // 3. Print map (sorted by keys)
        System.out.println("TreeMap: " + map); // Keys will be in sorted order

        // 4. Access elements
        System.out.println("Value for key 20: " + map.get(20));
        System.out.println("Contains key 10? " + map.containsKey(10));
        System.out.println("Contains value 'Grapes'? " + map.containsValue("Grapes"));

        // 5. Remove a key
        map.remove(30);
        System.out.println("After removing key 30: " + map);

        // 6. Size and empty check
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());

        // 7. Iterate through entries
        System.out.println("\nIterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 8. TreeMap-specific methods
        System.out.println("\nFirst key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Floor key of 25: " + map.floorKey(25)); // ≤ 25
        System.out.println("Ceiling key of 25: " + map.ceilingKey(25)); // ≥ 25

        // 9. Clear map
        map.clear();
        System.out.println("After clear():"+map);

  }
}
