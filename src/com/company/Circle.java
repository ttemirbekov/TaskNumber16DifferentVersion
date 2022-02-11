package com.company;

public class Circle {
    public static final double PI = 3.14;
    private double radius;

    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }
    public double area(){
        return PI  * (radius * radius);
    }
    public double cirumference(){
        return PI * 2 * radius;
    }


}
