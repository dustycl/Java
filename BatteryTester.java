/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

public class BatteryTester {

  public static void main (String [] args) {

    Battery battery = new Battery(3000.00);

    System.out.println("Battery Capacity: " + battery.getRemainingCapacity() + "mAh");
    System.out.println("Expected Result: 3000.00mAh");

    battery.drain(2500.00);
    System.out.println("Remaining Power: " + battery.getRemainingCapacity() + "mAh");
    System.out.println("Expected Result: 500.00mAh");

    battery.charge();
    System.out.println("Remaining Power: " + battery.getRemainingCapacity() + "mAh");
    System.out.println("Expected Result: 3000.00mAh");

    battery.drain(600.00);
    System.out.println("Remaining Power: " + battery.getRemainingCapacity() + "mAh");
    System.out.println("Expected Result: 2400.00mAh");

    battery.drain(750.00);
    System.out.println("Remaining Power: " + battery.getRemainingCapacity() + "mAh");
    System.out.println("Expected Result: 1650.00mAh");

    battery.charge();
    System.out.println("Remaining Power: " + battery.getRemainingCapacity() + "mAh");
    System.out.println("Expected Result: 3000.00mAh");

    return;
  }

}
