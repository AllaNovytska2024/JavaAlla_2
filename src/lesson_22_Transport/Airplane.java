package lesson_22_Transport;
/*
@date 13.06.2024
@author Alla Novytska
*/

import com.sun.jdi.connect.Transport;

public abstract class Airplane implements Flyable, Transport {

    public Airplane(int capacity) {
        super ();
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит по небу");
    }


    void takePassenger() {
        System.out.println("Самолет берет на борт пассажира");
    }

    public String getCapacity() {

        return null;
    }
}
