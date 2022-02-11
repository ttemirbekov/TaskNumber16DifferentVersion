package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Circle circle = new Circle();
        System.out.println("Enter the radius: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            double bRadius = scanner.nextDouble();
            Circle btcircle = new Circle(bRadius);
            System.out.println("Radius: " + btcircle.getRadius());
            System.out.println("Length: " + btcircle.area());
            System.out.println("Area: " + btcircle.cirumference());

        } else {
            System.out.println("It is not a number");
        }
    }

}
