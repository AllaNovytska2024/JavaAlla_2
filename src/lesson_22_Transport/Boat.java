package lesson_22_Transport;

/*
@date 13.06.2024
@author Alla Novytska
*/

import com.sun.jdi.connect.Transport;

public abstract class Boat implements Swimable, Transport {

    public Boat(int capacity) {
        super();
    }

    @Override
    public void swim() {
        System.out.println("Корабль плывет по морю");
    }


    void takePassenger() {
        System.out.println("Корабль берет на борт пассажира");
    }
}
