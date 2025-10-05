import java.util.* ;
public class Loops {
  public static void main(String[] args) {
    for(int i = 0 ; i<=10; i++){
      System.out.println("loop");
    }
    int a = 1;

    while (a < 11) {
      System.out.println(a);
      a++;
    }
    // do while atleast excutes the statement once even if the condition is false
    do{
       System.out.println("Do while excecuted at least once");
       a++;
    }
    while(a == 0);
    // now let us create a table of user given number up to 10
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number of your choice to print table");
    int n = sc.nextInt();
    for(int t = 0 ; t <=10 ; t++){
      System.out.println(n+"*"+ t +"="+ (n*t));
    }
    sc.close();
  }
}
