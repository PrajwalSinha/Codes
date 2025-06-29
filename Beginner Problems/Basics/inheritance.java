//Base class
class Vechile {
  String NumberOfVechile;
  public Vechile(String numberOfVechile){
    this.NumberOfVechile=numberOfVechile;
  }
  public void honk(){
    System.out.println("Honk!!!!!!!");
  }
   public void printNumberOfVechile(){
    System.out.println(numberOfCar);
  }
}

//derived class
class Car extends Vechile{

  public Car(String numberOfCar){
    super(numberOfCar);
  }
 
}
//derived class
class Bus extends Vechile{
  public Bus(String numberOfBus){
    super(numberOfBus);
  }

}



public class inheritance {

  public static void main(String[] args) {
    
    Car car = new Car("KA01W9876");
    car.printNumberOfVechile();
    car.honk();

    Bus bus = new Bus("KA081W7643")
    bus.printNumberOfVechile();
    bus.honk();
  }
  
}
