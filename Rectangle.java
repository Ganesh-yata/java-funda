import java.util.Scanner;
public class Rectangle {
  public static void main(String[] args) {
    

    int l,b;
    Scanner c1 = new Scanner(System.in);
    System.out.println("input length of rectangle");
    l = c1.nextInt();
    System.out.println("input breadth of rectangle");
    b = c1.nextInt();
    c1.close();
    System.out.println( "length * breadth of rectangle"+l*b);
    c1.close();
  }
}
