package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        Double radius = input.nextDouble();
        float pi = (float) 3.14;
        //float areaOfCircle = pi * radius * radius;
        while (radius.isNaN() || radius < 0 ) {
            System.out.println("Please enter a valid number for radius");
            radius = input.nextDouble();
        }
        if (radius > 0) {
            Double areaOfCircle = Circle.getArea(radius);
            System.out.println("Area of the circle of radius " + radius + " is: " + areaOfCircle);
        }
    }
}
