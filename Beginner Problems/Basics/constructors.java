class Test{
  double balance;
  string accountType;
  public Test(double _balance){
    balance = _balance;
    accountType = "Savings";
  }

  public Test(double _balance,String _accountType){
    balance = _balance;
    accountType = _accountType;
  }
  public void printBalance(){
    System.out.println(balance);
  }
  public void printHello() {
    System.out.println("Hello");
  }

}

public class constructors {
  
  public static void main(String[] args) {
    Test test = new Test(100);
    test.printBalance();
  }
}
