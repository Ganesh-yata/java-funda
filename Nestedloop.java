public class Nestedloop {
  public static void main (String[] args){
    for(int i=1 ; i<=5 ; i++){
      for (int j =1 ; j<=5; j++){
        System.out.print(j+ " ");
      }
      System.out.println();
    }

    // second charecters
    for(int i = 0; i<26; i++){
      for (char ch = 'A'; ch <= 'Z' ; ch++){
        System.out.print(ch +" ");
      }
      System.out.println();
    }
  }
}
