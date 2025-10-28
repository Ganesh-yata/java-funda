class school{
  public  school(String name){
    System.out.println("school is named as "+name);
  }
  public void teaching(){
    System.out.println("teaching");
  }
}


class student{
school s;
public  student(school s ){
  this.s = s ;
}
public void listening(){
  System.out.println("listening");
}
}

public class compo2{
  public static void main(String[] args) {
    school s = new school("my school");
    student st = new student(s);
    st.s.teaching();
    st.listening();
  }
}