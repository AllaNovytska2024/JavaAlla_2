package lesson_19;
/*
@date 10.06.2024
@author Sergey Bugaienko
*/

import autopark.BusDriver1;

public class AutoPark {
    public static void main(String[] args) {
        BusDriver1 busDriver = new BusDriver1("LN-19587456");

        autopark.Autobus bus = new autopark.Autobus(busDriver, 20);

        System.out.println(bus.toString());

        BusDriver1 busDriver1 = new BusDriver1("AE-54432353");
        bus.setDriver(busDriver1);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        autopark.Autobus bus2 = new autopark.Autobus(busDriver, 3);
        System.out.println(bus2.toString());

        autopark.Passenger passenger = new autopark.Passenger("John");
        autopark.Passenger passenger1 = new autopark.Passenger("Margo");
        autopark.Passenger passenger2 = new autopark.Passenger("Peter");
        autopark.Passenger passenger3 = new autopark.Passenger("Sebastian");
        autopark.Passenger passenger4 = new autopark.Passenger("Hanna");

        bus2.takePassenger(passenger);
        System.out.println("bus2.getCountPassenger(): " + bus2.getCountPassenger());

        bus2.takePassenger(passenger1);
        bus2.takePassenger(passenger);


        bus2.takePassenger(new autopark.Passenger("Test"));

        System.out.println(bus2.takePassenger(passenger2));


    }
}