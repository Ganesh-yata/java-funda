class school{
  public void teach(){
    System.out.println("teaching");
  }
  public school(){
    System.out.println("schooling");
  }
}


class student{
  school s;
  public void study(school s){
    this.s = s ;
  }
}


public class Compositionusingconstructor {
  public static void main(String[] args) {
    school s = new school();
    student st = new student();
    st.study( s);
    st.s.teach();
  }
}
