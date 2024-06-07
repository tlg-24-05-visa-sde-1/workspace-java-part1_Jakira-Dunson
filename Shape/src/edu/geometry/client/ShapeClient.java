package edu.geometry.client;

import edu.geometry.Shape;
import edu.geometry.Circle;
import edu.geometry.Triangle;
import edu.geometry.Rectangle;

class ShapeClient {

    public static void main(String[] args) {
        // create shape array
        Shape[] shapes = new Shape[3];

        // add shapes to array
        shapes[0] = new Circle(9.3);
        shapes[1] = new Triangle(33, 3, 13);
        shapes[2] = new Rectangle(9, 4);

        // create total area variable
        double totalArea = 0.0;
        System.out.println();
        // get the area of each shape, and the total area of all shapes combined
        for (Shape shape : shapes) {
            System.out.println(shape);
            totalArea += shape.getArea();
        }
        // print total area
        System.out.printf("Total area: %.2f inches squared", totalArea);
    }
}