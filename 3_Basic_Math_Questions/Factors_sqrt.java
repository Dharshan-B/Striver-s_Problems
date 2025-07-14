public class Factors_sqrt {
  public static void factor(int a){
    int a1 = (int)Math.sqrt(a);//Converting the Double(As Math.sqrt() support only the double) to int
    for(int i =1;i<=a1;i++){ //Checking the element till the 4 as sqrt(18) = 4.22 equivalent to 4
      if(a%i==0){ // Remanider should be Zero
        System.out.print(i+" ");//Printing the i vales 
        if(i!=a/i){//Without printing the duplicate value 
          System.out.print(a/i+" ");//Pairs for the Ith values 
        }
      }
    }
     System.out.println("");
  }
  public static void main(String[] args){
    int a = 18;
    factor(a);//THIS PRINTS IN UNORDERED WAY.
  }
}
/*
 Printing the factors in the Sorted Order

ArrayList : Just like array but the size is Dynamic 
HashSet: Unordered set (fast but unsorted)
TreeSet: Ordered set (sorted automatically) --> Using this we should sort

import java.util.*;

public class TreeSetExample {
  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    int a = 13;
      for (int i = 1; i <= Math.sqrt(a); i++) {
      if (a % i == 0) {
        set.add(i);         // i is a factor
        set.add(a / i);     // a/i is also a factor
      }
    }
    System.out.println("TreeSet elements: " + set);
  }
}

 */
