//Abstact Class
abstract class Car{

  public abstract void drive();
  public abstract void fly();
  public void playMusic(){
    System.out.println("Playing Music");
  }

}

abstract class WagonR extends Car{

  public void drive(){
    System.out.println("Drive Implementation");
  }

  public abstract void fly();
 
}

//Concrete Class - Everything apart from abstract class is concrete class.
class UpdatedWagonR extends WagonR{

  public void fly(){
    System.out.println("Flying Implementation");
  }
}

public class abstracting {
  public static void main(String[] args) {
    Car car = new UpdatedWagonR();

    car.playMusic();
    car.drive();
    car.fly();
  }  

}
