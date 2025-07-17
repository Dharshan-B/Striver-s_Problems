import java.util.Arrays;
public class ReverseArray {
  public static void main(String[] args){
    String A = "the Shy is Blue";
    String[] words = A.trim().split("\\s+");
    System.out.println(Arrays.toString(words));
  }
}
