package com.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public double calculateDistanceBetweenPoints(
        double x1, 
        double y1, 
        double x2, 
        double y2) {       
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static void main( String[] args )
    {
        App app = new App();

        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 4.0;
        double y2 = 6.0;

        double distance = app.calculateDistanceBetweenPoints(x1, y1, x2, y2);

        System.out.println("Distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
    }
}
