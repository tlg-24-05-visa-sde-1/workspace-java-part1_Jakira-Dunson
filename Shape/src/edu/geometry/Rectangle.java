package edu.geometry;

import java.awt.*;

public class Rectangle extends Shape {
    // properties
    private final double length;
    private final double width;

    // constructors
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // business methods

    @Override
    public double getArea() {
        double area = getLength() * getWidth();
        return area;
    }
    // accessor methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}