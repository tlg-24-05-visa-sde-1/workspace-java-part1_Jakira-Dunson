package edu.geometry;

import java.awt.*;

public class Circle extends Shape {
    // static fields/methods
    private final double radius;

    // constructors
    public Circle(double radius) {
        this.radius = radius;
    }
    // business methods
    @Override
    public double getArea() {
        double area = Math.PI * (getRadius() * getRadius());
        return area;
    }
    // accessor methods
    public double getRadius() {
        return radius;
    }
}