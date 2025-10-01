public class Switch {
  public static void main (String[] args){
    int a,b;
    a = 30 ;
    b = 20 ;
    switch(a+b){
      case 20: System.out.println("sum is 20");
      break;
      case 50: System.out.println("sum is 50");
      break;
      default: System.out.println("this is default case a+b");
    }
  }
}
