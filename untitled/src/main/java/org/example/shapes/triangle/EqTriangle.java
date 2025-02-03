package org.example.shapes.triangle;

import org.example.shapes.interfaces.IRegularPolygon;

public class EqTriangle implements ITriangle,IRegularPolygon {
    private final double sideLength;

    public EqTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    //define multiple methods to have same body
    public double getLongestSide() {
        return getSideLength();
    }
    public double getShortestSide() {
        return getSideLength();
    }
    public double getMiddleLengthSide() {
        return getSideLength();
    }


    public double getSideLength() {
        return sideLength;
    }

    public double getPerimeter() {
        return 3*sideLength;
    }

    public double getArea() {
        double height = Math.sqrt(sideLength*sideLength - (sideLength/2)*(sideLength/2));
        return 0.5 * sideLength * height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shape Information & Details");
        sb.append("\n\tShape : Equilateral Triangle")
                .append("\n\t\tSide Length : ").append(this.sideLength)
                .append("\n\t\tPerimeter : ").append(this.getPerimeter())
                .append("\n\t\tArea : ").append(this.getArea());
        return sb.toString();
    }
}
