import java.util.TreeSet;
//Maintains the sorted order(Ascending)
//Does not allow duplcates 
//Internally Uses a red-black tree
//very slow than hashset
public class TreeSetExample {
  public static void main(String[] args){
     // 1. Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // 2. Add elements
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate, ignored

        // 3. Print all elements (sorted)
        System.out.println("TreeSet: " + numbers); // [10, 20, 30, 40]

        // 4. Check if an element exists
        System.out.println("Contains 20? " + numbers.contains(20)); // true
        System.out.println("Contains 50? " + numbers.contains(50)); // false

        // 5. Remove an element
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers); // [20, 30, 40]

        // 6. Size of the set
        System.out.println("Size: " + numbers.size());

        // 7. Check if set is empty
        System.out.println("Is set empty? " + numbers.isEmpty());

        // 8. Iterate using for-each loop
        System.out.println("Iterating through TreeSet:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 9. Extra TreeSet methods
        System.out.println("First: " + numbers.first());   // Smallest element
        System.out.println("Last: " + numbers.last());     // Largest element
        System.out.println("Higher than 25: " + numbers.higher(25)); // 30
        System.out.println("Lower than 30: " + numbers.lower(30));   // 20

        // 10. Clear the set
        numbers.clear();
        System.out.println("After clear(): " + numbers);
        System.out.println("Is set empty now? " + numbers.isEmpty());
  }  
}
