
public class NtimeswithBas {
  public static int count(int n){
    int count = 0;
    for(int i = 0;i < n ; i++){
      count++;
      System.out.println(count);
    }
    return count(n);
    
  }
  public static void main(String[] args){
    int n = 12;
    System.out.println(count(n));

  }
}
