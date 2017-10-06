/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

public class RoachPopulation {
  private double population;

  public RoachPopulation(double amount) {
    population = amount;

  }

  public void breed() {
    population = population * 2;

  }

  public void spray(double percent) {
    population = population - (population * percent);

  }

  public double getRoaches() {

    return population;
  }

}
