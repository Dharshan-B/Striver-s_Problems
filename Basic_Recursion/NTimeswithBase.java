package Basic_Recursion;

public class NTimeswithBase {
  static int count = 0;
  static void print(){
    //Base Condition
    if(count == 3){
      System.out.println(count);
      return;
    }
    //Count increment
    System.out.println(count);
    count++;
    print();
  }

  public static void main(String[] args){
    print();
  }
}
