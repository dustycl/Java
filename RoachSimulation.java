/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

public class RoachSimulation {

  public static void main(String [] args) {
    RoachPopulation roaches = new RoachPopulation(10.0);

    System.out.println("Initial Roach Population: " + roaches.getRoaches());
    System.out.println("Expected: 10.0");

    roaches.breed();
    System.out.println("New Roach Population: " + roaches.getRoaches());
    System.out.println("Expected: 20.0");

    roaches.spray(0.10);
    System.out.println("New Roach Population: " + roaches.getRoaches());
    System.out.println("Expected: 18.0");

    roaches.breed();
    System.out.println("New Roach Population: " + roaches.getRoaches());
    System.out.println("Expected: 36.0");

    roaches.spray(0.10);
    System.out.println("New Roach Population: " + roaches.getRoaches());
    System.out.println("Expected: 32.4");

    roaches.breed();
    System.out.println("New Roach Population: " + roaches.getRoaches());
    System.out.println("Expected: 64.8");

    roaches.spray(0.10);
    System.out.printf("New Roach Population: %.1f \n", roaches.getRoaches());
    System.out.println("Expected: 58.3");

  }

}
