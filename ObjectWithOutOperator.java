class student{
    int id = 320 ;
    String name = "ganesh" ;
    public void study (){
      System.out.println("studying");
    }
  }

public class ObjectWithOutOperator {
  public static void main(String[] args) throws Exception {
    Class c = Class.forName("student");
    Object o = c.newInstance();
    student s = (student) o;
    System.out.println("student id: " + s.id + "student name: " + s.name);
    s.study();
  }
}