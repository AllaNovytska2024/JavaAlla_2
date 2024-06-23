package lesson_21_Transport;

/*
@date 12.06.2024
@author Sergey Bugaienko
*/

public class Car extends VehicleWithEngine {


    public Car(Engine engine) {
        super();
        this.setEngine(engine);
    }



    @Override
    public String toString() {
        // Todo А если двигатель null?
        return "Car {id: " + getId() + "; engine: " + getEngine() + "}";
    }


}
