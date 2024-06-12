package HomeWork_20_Vehicle;
/*
@ date 12.06.2024
@ author Alla Novytska

Task 2
Создайте иерархию классов для разных типов транспортных средств:
 Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(),
 который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить
метод startEngine() для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов.
Используйте полиморфизм для вызова метода startEngine()
для каждого транспортного средства.
 */
public abstract class Vehicle {
    public abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Машина едет с помощью двигателя.");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Велосипед не имеет двигателя.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Мотоцикл заводится со стартера.");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}