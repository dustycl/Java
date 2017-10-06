/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

import java.util.Random;

public class LotteryPrinter {

  public static void main(String [] args) {

    Random lottery = new Random();
    final int CHOICES = 6;

    System.out.println("Play this combination -- it'll make you rich!");
    for (int i = 1; i <= CHOICES; i++) {
      int num = 1 + lottery.nextInt(49);
      System.out.print(num + " ");

    }

    System.out.println();

  }
}
