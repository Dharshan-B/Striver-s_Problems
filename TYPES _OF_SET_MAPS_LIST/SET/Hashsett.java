//No Guaranteed Order (Unsorted) and fast
//Uses Hashing internally

import java.util.HashSet;
public class Hashsett {
  public static void main(String[] args) {
        // 1. Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate, will be ignored

        // 3. Print all elements (order not guaranteed)
        System.out.println("HashSet: " + fruits);

        // 4. Check if an element exists
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple")); // true
        System.out.println("Contains 'Grapes'? " + fruits.contains("Grapes")); // false

        // 5. Remove an element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // 6. Size of the set
        System.out.println("Size: " + fruits.size());

        // 7. Check if set is empty
        System.out.println("Is set empty? " + fruits.isEmpty());

        // 8. Iterate using for-each loop
        System.out.println("Iterating through HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. Clear the set
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("Is set empty now? " + fruits.isEmpty());
    }  
}
