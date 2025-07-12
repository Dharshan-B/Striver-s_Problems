public class Count_Digits{
  public static void main(String[] args){
    int a = 1234;
    int count = 0;
    if(a == 0){
      System.out.println("1");
    }
    else{
          while(a>0){
          a = a/10;
          count++;
          }
      System.out.print(count);
    }
  }
}