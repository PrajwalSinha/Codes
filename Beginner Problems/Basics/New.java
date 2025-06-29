public class New {
  
  public static void main(String[] args) {
    int num1 = 6;
    int num2 = num1++; // num2 is still 6
    System.out.println("num1: " +num1);
    System.out.println("num2: "+num2);

    //relational -> ==,!=,>,<,>=,<=
    int re = 6;
    int re1 = 7;
    boolean result = re!=re1;
    System.out.println("result: "+result);

    // &&, ||
    boolean first = true;
    boolean second = false;
    boolean result1 = first && second;

    System.out.println("result: "+result1);

    //ternary operators 
    //condition ? first : second
    int a = 3;
    int b = 4;
    int c = a > b ? a : b;
    System.out.println(c);

  }
}
