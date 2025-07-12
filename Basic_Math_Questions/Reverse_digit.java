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
/*
Optimized and Edge case Clearence
 */
/*
Optimized and Edge case Clearence
class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int resNum  = 0;
        while(x>0){
            int num = x%10;
                if (resNum > Integer.MAX_VALUE / 10 || (resNum == Integer.MAX_VALUE / 10 && num > 7)) {
                    return 0;
                }
                if (resNum < Integer.MIN_VALUE / 10 || (resNum == Integer.MIN_VALUE / 10 && num < -8)) {
                    return 0;
                }
            resNum = (resNum*10)+num;
            x=x/10;
        }
        return isNegative ? -resNum : resNum;    
    }
}
 */