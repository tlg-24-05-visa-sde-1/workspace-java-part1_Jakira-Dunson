package edu.geometry;

public abstract class Shape {

    // static fields/methods
    private String unitOfMeasurement = "inches squared";

    // constructors
    public Shape() {
        super();
    }
    // business methods
    public abstract double getArea();

    // accessor methods
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }
    // toString()
    public String toString() {
        return String.format(
                "%s area: %.2f %s", getClass().getSimpleName(), getArea(), getUnitOfMeasurement());
    }
}