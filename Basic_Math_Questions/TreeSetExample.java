import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args){
    TreeSet<Integer> set = new TreeSet<>();
    int a = 18;
      for (int i = 1; i <= Math.sqrt(a); i++) {
      if (a % i == 0) {
        set.add(i);         // i is a factor
        set.add(a / i);     // a/i is also a factor
      }
    }
    System.out.println("TreeSet elements: " + set);
  }  
}
