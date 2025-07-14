import java.util.*;
public class Print_all_Divisor {
  public static void Divisors(int n){
    int n1 = (int)Math.sqrt(n); 
    for(int i =1;i<=n1;i++){
      if(n%i==0){
        System.out.println(i);
        if(i!=n/i){
            System.out.println(n/i);
        }
      }
    }
    
  }
  public static void main(String[] args){
    int n = 12;
    Divisors(n);
  }
}
