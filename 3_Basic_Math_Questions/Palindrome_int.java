public class Palindrome_int {
  public static boolean palin(int x){
    if(x<0) return false;
    int original = x;
    int Reversed = 0;
    while(x > 0){
      int num = x% 10 ;
      Reversed = (Reversed * 10)+ num;
      x = x/10;
    }
    if(original==Reversed)
      return true;
    else
      return false;
  }
  public static void main(String[] args){
    int x = 121;
    System.out.println(palin(x));
  }  
}
