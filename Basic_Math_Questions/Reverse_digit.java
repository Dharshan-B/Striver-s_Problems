public class Reverse_digit {

  public static int reverse(int N){
    int revNum = 0;
    while(N > 0){
      int num = N%10;
      revNum = (revNum * 10)+num;
      N = N /10;
    }
    return revNum;
  }
  public static void main(String[] args){
    int N = 12345;
    int result = reverse(N);
    System.out.println(result);
  }
}
