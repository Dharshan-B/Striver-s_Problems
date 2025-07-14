public class Prime {
  public static Boolean p(int n){
    if(n<=1) return false;
    for(int i =2;i<=Math.sqrt(n);i++){
      if(n%2==0){
        return false;
      }
    }
    return true;

  }
  public static void main(String[] args){
    int n = 1;
    System.out.println(p(n));
  }  
}
