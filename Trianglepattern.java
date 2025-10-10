public class Trianglepattern {
  public static void main(String[] args){
   int i = 5 ;
    for(int j = 1 ; j<=i; j++){
      for(int k = 1; k<=j; k++){
        System.out.print("x ");
      }
      System.out.println();
   }
// inverted trinagle 
   int limit = 1;
   for (int k = 5 ; k>limit ; k--){
      for(int j = 1; j<=k ; j++){
        System.out.print("* ");
      }
      System.out.println();
   }
  }

}
