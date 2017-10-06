/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

public class CarTester {

  public static void main(String [] args) {

    Car myHybrid = new Car(50);

    myHybrid.addGas(20);
    myHybrid.drive(100);
    double gasLeft = myHybrid.getGasInTank();

    System.out.println(gasLeft + " gallons of gas left in tank.");
    System.out.println("Expected: 18.0");

  }
}
