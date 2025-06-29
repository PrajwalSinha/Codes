import java.util.Scanner;
class Test {
  int age;
  //void method
  public void assignAge(int num) {
    age=num;
  }

  public int sum(int num1, int num2){
    return num1+num2;
  }
}

public class oops {
  //write a method that is exclusive to the basics - use private
  private static int num(){
    return 10;
  }
  public static void main(String[] args) {
    System.out.println(num());
    System.out.println("Hello");
    Scanner sc = new Scanner(System.in);
  
    Test test1 = new Test();
    test1.assignAge(10);

    Test test2 = new Test();
    test2.assignAge(19);

    System.out.println(test1.age);
    System.out.println(test2.age);

    Test test3 = new Test();
    System.out.println(test3.sum(1, 2));

    sc.close();
  }
}

//acess specifiers
//public -> everyone
//private -> current class
// protected -> current package and all other sub packages
//in static method you dont have to create object means you can directly access them.