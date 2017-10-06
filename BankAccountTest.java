public class BankAccountTest {

/**
Tests the methods of the BankAccount class.
@param args not used
*/

  public static void main(String[] args) {

    BankAccount harrysChecking = new BankAccount();
    harrysChecking.deposit(2000);
    harrysChecking.withdrawl(500);
    System.out.println(harrysChecking.getBalance());
    System.out.println("Expected: 1500");
  }

}
