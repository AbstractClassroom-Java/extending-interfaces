package org.example;

import org.example.shapes.ellipse.Circle;
import org.example.shapes.rectangle.Rectangle;
import org.example.shapes.rectangle.Square;
import org.example.shapes.triangle.EqTriangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,3);
        System.out.println(rect1);

        Square sqr1 = new Square(5);
        System.out.println(sqr1);

        Circle c1 = new Circle(4);
        System.out.println(c1);

        EqTriangle eqt1 = new EqTriangle(6);
        System.out.println(eqt1);
    }
}