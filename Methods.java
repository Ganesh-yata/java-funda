public class Methods {
  public void sum() {
    int a = 10;
    int b = 20;
    int c = a + b;
    System.out.println(c);
  }

  public int multiply() {
    int a = 10;
    int b = 20;
    int c = a * b;
    return (c);
  }

  public void minus(int a, int b) {
    int c = a - b;
    System.out.println(c);
  }

  public int divison(int a, int b) {
    int c = a / b;
    return (c);
  }

  public static void main(String[] args) {
    Methods calculation = new Methods();
    calculation.sum();
    calculation.minus(18, 10);
    int resmul = calculation.multiply();
    System.out.println(resmul);
    int resdiv = calculation.divison(500, 25);
    System.out.println(resdiv);
  }
}