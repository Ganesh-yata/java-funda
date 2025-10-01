import java.util.Scanner;
public class Day2 {
  public static void main(String[] args) {
    int a = 10 ;
    char c = 'v' ;
    int p;
    System.out.println(a);
    System.out.println(c);
    System.out.println("ganesh");
    System.out.println("variable a is " + a );
    System.out.println("please enter a number ");
    Scanner s1 = new Scanner(System.in);
    p = s1.nextInt() ;
    s1.close();
    System.out.println("you have entred "+p);
  }
}
