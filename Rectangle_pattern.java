public class Rectangle_pattern {
  public static void main(String[] args) {
    int n = 4;
    int m = 10;
    // outer loop 
    for (int i = 1 ; i<=n ; i++){
      //inner loop 
      for (int j = 1 ; j<m ; j++){
        System.out.print("* "); 
      }
      System.out.println();
    }

  }
}
