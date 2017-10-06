/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

public class Car {
  private double gas;
  private double efficiency;

  public Car(double anEfficiency) {
    efficiency = anEfficiency;

  }

  public void addGas(double amount) {
    gas = gas + amount;

  }

  public void drive(double distance) {
    gas = gas - (distance / efficiency);

  }

  public double getGasInTank() {

    return gas;
  }


}
