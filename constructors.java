class Student{
  int id;
  String name;
  double fees ;
  public Student ( int id, String name, double fees){
    this.id = id ;
    this.name = name;
    this.fees = fees;
  }
  public void show(){
    System.out.println( "id :" + id + "name :" + name + "fees :" + fees);
  } 
}
public class constructors {
  public static void main(String[] args) {
    Student s1 = new Student(1,"Rajesh",7200.0);
    Student s2 = new Student(1,"Rajesh",7200.0);
    s1.show();
    s2.show();
  }
}
