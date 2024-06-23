

package lesson_22a.hw.shapes;
/*
@date 13.06.2024
@author Alla Novytska
*/

public class Rectangle extends  Shape{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (sideA + sideB) * 2;
    }
}
