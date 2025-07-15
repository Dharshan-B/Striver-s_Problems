package Basic_Recursion;
//Finding the sum for the natural numbers
public class Sum {
  static int find_sum(int n){
    //base case
    if(n == 1) return 1;
    return n + find_sum(n-1);
  }
  public static void main(String[] args){
    int n = 5;
    System.out.println(find_sum(n));
  }
}
