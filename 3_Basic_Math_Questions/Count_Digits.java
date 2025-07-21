//Works for all the edge test cases 
public class Count_Digits{
  public static void main(String[] args){
    int a = -1234;
    int b = Math.abs(a);
    int count = 0;
    if(b == 0){
      System.out.println("1");
    }
    else{
          while(b>0){
          b = b/10;
          count++;
          }
      System.out.print(count);
//1st commit
    }
  }
}