//Using the Euclidean Algorithm we can get the greatest common divisor of the two numbers 
//This approach is more efficient and effective in terms of the Time complexity 
//The brute force is not recommended for this kind of problems 
public class GCD {
  public static int Gvd(int a,int b){
    while(b!=0){//b=13
      int temp = b;//temp = 13
      b = a%b;//b = 12
      a=temp;//a=13 as temp is assigned with b at first 
    }
    return a;
  }
  public static void main(String[] args){
    int a=12,b = 13;
    System.out.println(Gvd(a,b));
  }
}
