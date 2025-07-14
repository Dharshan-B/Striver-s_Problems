public class Check_ArmStrong {
  public static boolean arm(int n){
    int original = n;
    int sum = 0;
    int digits = String.valueOf(n).length();
    while(n != 0){
      int digit = n % 10;
      sum += Math.pow(digit,digits);
      n /= 10;
    }
    return sum == original;
  }
  public static void main(String[] args){
    int n = 123;
    if(arm(n)){
      System.out.println(n+"Is an Armstrong Number");
    }else{
      System.out.println(n+"is Not a Armstrong Number");
    }
  }
}
