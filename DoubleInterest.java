public class DoubleInterest {

  public static void main(String[] args){
    double targetBalance = 20000;
    double balance = 10000;
    int year = 0;
    final double RATE = 10;

    while (balance < targetBalance){
      year++;
      double interest = balance * RATE / 100;
      balance = balance + interest;

    }
    System.out.println("It will take " + year + " years to double the balance to $" + balance);
  }
}
