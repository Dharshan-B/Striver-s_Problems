public class Palindrome_String {
  public static Boolean Palin(String Word){
    Word=Word.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    int left = 0;
    int right = Word.length()-1;

    while(left < right){
      if(Word.charAt(left)!=Word.charAt(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;

  }

  public static void main(String[] args){
    String Word = "Malam";
    System.out.println(Palin(Word));
  }
}
