public class Pyramid {
  public static void main(String[] args) {
    // simple pyramid
    int num = 5 ;
    for(int i = 1; i<=num ; i++){
      for(int j = num ; j>i ; j--){
        System.out.print(" "); 
      }
      for(int k = 1; k<=i ; k++){
         System.out.print("x ");
      }
      System.out.println();
    }
    // inverted pyramid and can make a rombhus
    for(int i = num; i>=1 ; i--){
      for(int j = num; j>i ; j--){
        System.out.print(" ");
      }
      for(int k =1 ; k<=i; k++){
        System.out.print("x ");
      }
      System.out.println();
    }

    // right angle triangle only replacing spaces as 2 in previous code 
    for(int i = 1; i<=num ; i++){
      for(int j = num ; j>i ; j--){
        System.out.print("  "); 
      }
      for(int k = 1; k<=i ; k++){
         System.out.print("x ");
      }
      System.out.println();
    }
  }
}
