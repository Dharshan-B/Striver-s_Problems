package Basic_Recursion;

public class print1toN {
  static void print(int n , int i){
    //Base Condition
    if(i<n) return;
    //Print the Current Number
    System.out.println(i);
    //Recursive Call
    print(n+1,i);
    }
  public static void main(String[] args){
    int n = 12;
    print(1,n);
  }
}
