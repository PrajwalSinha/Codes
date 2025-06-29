import java.util.*;

public class ll {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    Collections.reverse(list);
    System.out.println("Reversed list is: "+ list);
  }
}
