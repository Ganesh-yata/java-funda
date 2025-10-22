// instance factory method
class accounts{
  int acNo = 150000 ;
  double balence = 30000 ;
  public void debit (){
    System.out.println("Amount debited");
  }
  public void credit (){
    System.out.println("Amount credited");
  }
}
class accountFactory {   // factory class
  public Object Acdetails(){ // factory method
  accounts a = new accounts();
  return a ;
  }
}

public class FactoryMethods {
public static void main(String[] args) {
  accountFactory af = new accountFactory(); // creating object for factory class
  accounts ac = (accounts) af.Acdetails(); // 

  System.out.println("acNO is :" + ac.acNo + "balence is :" + ac.balence);
  ac.debit();
  ac.credit();
}
  
}

// static factory method

class  bike {
  int regNo = 3081 ;
  String model = "MT-15" ;
  public void drive(){
    System.out.println("driving");
  }
}

class bikeFactory {
public static bike bikeDetails(){
  return new bike ();
}
}

 class Acess {
public static void main(String[] args) {
  bike b = bikeFactory.bikeDetails();
  b.drive();
  System.out.println("bike regNO is:" + b.regNo + "bike model is :" + b.model);
}
}


// trial for instance factory

class Vehicle{
  int vehicleId = 123;
  String vehicleType = "camper van";
  public void start(){
    System.out.println("starting the ignition");
  }
  public void stop(){
    System.out.println("stopping the ignition");
  }
}
class factoryVehicle{
  public Vehicle vehicleDetails(){
    Vehicle v = new Vehicle();
    return v ;
  }
}

class min {
  public static void main(String[] args) {
    factoryVehicle fv = new factoryVehicle();
    Vehicle vd = fv.vehicleDetails();
    System.out.println(vd.vehicleId);
  }
}
// static factory method trial -final

class Dog{
  int id = 001;
  String breed = "shitzu" ;
  public void bark (){
    System.out.println("barking bow-bow ");
  }
}
class factoryDog {
  public static  Dog dogDetails(){
    Dog d = new Dog();
    return d;
  }
}

class doog {
public static void main(String[] args) {
  Dog dD =  factoryDog.dogDetails();
  System.out.println(dD.breed);
}
}