interface A{

  int age = 32; //final and static in interface
  String area = "Mumbai";
  void show();
  void print();
}

class B implements A{
  public void show(){
    System.out.println("Showing");
  }
  public void print(){
    System.out.println("Printing");
  }
}

public class interfacing {
  
  public static void main(String[] args) {
    A obj;
    obj = new B();

    obj.show();
    obj.print();
  }
}
