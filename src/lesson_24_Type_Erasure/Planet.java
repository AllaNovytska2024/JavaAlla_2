package lesson_24_Type_Erasure;

//Enums могут содержать поля, методы и конструкторы.
//Создадим enum для планет, где каждая планета будет иметь радиус и массу.


public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);
    // Другие планеты

    private final double mass;    // в килограммах
    private final double radius;  // в метрах

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}