/*
Author: Lamperts, Dustin
Group members: Islas, Bryan; Singh, Buta; Reynoso, Dylan
Assignment: Programming Assignment Two
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/09/27
*/

public class Balloon {

    private double balloonRadius = 0.0;

    public void inflate(double radiusGiven) {
        balloonRadius = balloonRadius + radiusGiven;

    }

    public double getVolume() {
        //balloonVolume = Math.PI * ((balloonRadius * balloonRadius) * balloonRadius);
        return (4 * Math.PI * balloonRadius * balloonRadius * balloonRadius) / 3;
    }


}
