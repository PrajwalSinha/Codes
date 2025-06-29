import java.util.Scanner;

public class input {
  
  public static void main(String[] args) {
    
    //input - scanner is a class and we have to create a object of it
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println(num);
    

    scanner.close();

  }
}
