package lesson_21_Transport;

/*
@date 12.06.2024
@author Sergey Bugaienko
*/

public class Motocycle extends VehicleWithEngine {

    public Motocycle(Engine engine){
        super();
        setEngine(engine);
    }

    @Override
    public String toString() {
        return "Motocycle {id:" + getId() + ";engine " + getEngine() + "}";
    }



}
