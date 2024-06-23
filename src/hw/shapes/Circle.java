package hw.shapes;/*
@date 13.06.2024
@author Sergey Bugaienko
*/

import java.awt.*;

public abstract class Circle implements Shape, lesson_22a.printables.Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double area() {
        // Pi * r * r
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // Длина окружности
        // 2 * Pi * r (Pi * d)
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                '}';
    }
}