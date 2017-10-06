/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

public class Battery {
  private double batteryCapacity;
  private double remainingPower;

  public Battery(double capacity) {
    batteryCapacity = capacity;
    remainingPower = capacity;

  }

  public void drain(double amount) {
    remainingPower = remainingPower - amount;

  }

  public void charge() {
    remainingPower = batteryCapacity;

  }

  public double getRemainingCapacity() {

    return remainingPower;
  }

}
