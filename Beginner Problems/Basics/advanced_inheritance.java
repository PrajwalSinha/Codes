import java.util.*;

//Parent class or super class
class School{
  private String name;

  School(){
    name = "DPS";
  }
  void printSchoolName(){
    System.out.println("School name: "+name);
  }
}
//subclass or child class
class Student extends School{
  private String name;
  Student(String name){
    this.name = name;
  }
  void printStudentName(){
    System.out.println("Student name: "+name);
  }
}

class Parent extends Student {
  private String name;
  Parent(String name, String studentName){
    super(studentName);
    this.name = name;
  }
}
public class advanced_inheritance {
  public static void main(String[] args) {
    
    Student student = new Student("Raj");

    student.printStudentName();
    student.printSchoolName();

  }
}
