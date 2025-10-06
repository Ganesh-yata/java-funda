public class Number{
  public static void main(String[] args){
 // let me print a pattern containing numbers as pattern 
 //outer loop 
 for (int i = 0 ; i<6 ; i++){
  // inner loop for horizontal printing with cursor on the same line
  for (int j = 0 ; j<6 ; j++){
    // now for print add i+1 becomes series  when first row i =0+1 row 1 repeats 1 after, i becomes 1+1 so now 2 in another row as j is carried out and so on.........
    System.out.print(i+1 + " ");
  }
  System.out.println(i+1);
 }
  }
 
}
