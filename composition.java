class vehicle {
   int regno = 3081 ;
   public void honking(){
    System.out.println("honking");
   }
}


class bullet{
  vehicle v = new vehicle();
  public void kickStart(){
     
    System.out.println("engine starting");
  }
  public void horn(){
    v.honking();
  }
}


public class composition {
  public static void main(String[] args) {
    bullet b = new bullet();
    b.horn();
  }
}
