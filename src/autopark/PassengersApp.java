package autopark;

/*
@date 11.06.2024
@author Sergey Bugaienko
*/



public class PassengersApp {
    public static void main(String[] args) {

        autopark.Autobus bus = new autopark.Autobus(new BusDriver1("LN-454575"), 10);

        System.out.println(bus.toString());

        System.out.println("Список пассажиров: " + bus.getPassengersList());

        autopark.Passenger passenger = new autopark.Passenger("Max");
        autopark.Passenger passenger1 = new autopark.Passenger("John");
        autopark.Passenger passenger2 = new autopark.Passenger("Mary");
        autopark.Passenger passenger3 = new autopark.Passenger("Bob");

        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);

        bus.dropOfPassenger(passenger3);
        System.out.println(bus.dropOfPassenger(passenger1));

        System.out.println(bus.getCountPassenger());

        bus.takePassenger(passenger3);

        String passengersList = bus.getPassengersList();
        System.out.println("Список пассажиров: " + passengersList);

        bus.dropOfPassenger(passenger);

        System.out.println(bus.getPassengersList());


    }
}