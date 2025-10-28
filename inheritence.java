class parent{
  int id = 1;
  public void scold(){
    System.out.println("scolding");
  }
}
class child extends parent{ // child class is aquiring the properties of parent
    public void cry(){
      System.out.println("crying");
    }
  }
public class inheritence {
  public static void main(String[] args) {
    child c = new child();
    c.scold(); //calling parent class methods via child object
  }
}
