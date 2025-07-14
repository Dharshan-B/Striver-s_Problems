//Maintains the insertion order (Unlike Hashset)
//Does not allow duplicates
//Uses the hash table and the doubly linkedlist
import java.util.*;
public class LinkedHashSett {
  public static void main(String[] args) {
        // 1. Create a LinkedHashSet
        LinkedHashSet<String> countries = new LinkedHashSet<>();

        // 2. Add elements
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("Germany");
        countries.add("India"); // Duplicate, ignored

        // 3. Print all elements (insertion order maintained)
        System.out.println("LinkedHashSet: " + countries);

        // 4. Check if an element exists
        System.out.println("Contains 'UK'? " + countries.contains("UK"));
        System.out.println("Contains 'Canada'? " + countries.contains("Canada"));

        // 5. Remove an element
        countries.remove("USA");
        System.out.println("After removing 'USA': " + countries);

        // 6. Size of the set
        System.out.println("Size: " + countries.size());

        // 7. Check if set is empty
        System.out.println("Is set empty? " + countries.isEmpty());

        // 8. Iterate using for-each loop
        System.out.println("Iterating through LinkedHashSet:");
        for (String country : countries) {
            System.out.println(country);
        }

        // 9. Clear the set
        countries.clear();
        System.out.println("After clear(): " + countries);
        System.out.println("Is set empty now? " + countries.isEmpty());
    }
}
