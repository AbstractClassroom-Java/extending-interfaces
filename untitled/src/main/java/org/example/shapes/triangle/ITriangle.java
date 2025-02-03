package org.example.shapes.triangle;

import org.example.shapes.interfaces.IPolygon;
import org.example.shapes.interfaces.IShape;

public interface ITriangle extends IPolygon {
    double getLongestSide();
    double getShortestSide();
    double getMiddleLengthSide();

    default int getNumberOfSides() {
        return 3;
    }
}
