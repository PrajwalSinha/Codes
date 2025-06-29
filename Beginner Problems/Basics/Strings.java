public class Strings {
  
  public static void main(String[] args) {
    String name = "Prajwal Sinha";
    System.out.println(name + "has length"+ name.length());

    System.out.println(name.charAt(0));
    //dosent include the ending index
    System.out.println(name.substring(0, 3));

    String name1 = "raj";
    String lastname = "vikram";
    name1+=" "+ lastname;
    System.out.println(name1);

    //in java the strings are inmutable
    //so when you create raj there is an object which is created in the memory

    //char array to string in java
    char ch[] = {'a','b','c'};
    String s1 = String.valueOf(ch);
    System.out.println("s1 value: "+s1);

    String s2 = new String(ch);
    System.out.println("s2 value: "+s2);

    boolean resi = name1==lastname;
    System.out.println(resi);

  }
}
