package com.greham;

public class BasicArithmeticOps {
    public static void main(String[] args) {
        // Given radius
        double radius = 12.7;

        // Calculate the area of the circle
        double AreaOfaCircle = Math.PI * Math.pow(radius, 2);

        // Print the result with the unit of measurement
        System.out.println("The area of the circle with radius " + radius + " meters is: " + AreaOfaCircle + " square meters");
    }
}
