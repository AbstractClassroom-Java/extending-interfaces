package org.example.shapes.rectangle;

import org.example.shapes.interfaces.IPolygon;

public interface IRectangle extends IPolygon {
    double getLongestSide();
    double getShortestSide();

    default int getNumberOfSides() {
        return 4;
    }
}

