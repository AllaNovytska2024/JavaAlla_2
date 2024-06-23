package lesson_22_Transport;

/*
@date 13.06.2024
@author Alla Novytska
*/

public class MainApp {

    public static void main(String[] args) {

        Airplane airplane = new Airplane(130) {
            @Override
            public String name() {
                return "";
            }
        };
        Boat boat = new Boat(40) {
            @Override
            public String name() {
                return "";
            }
        };

        Duck duck = new Duck("желтая");

        Flyable[] flyers = new Flyable[3];
        flyers[0] = airplane;
        flyers[1] = duck;
        flyers[2] = new Airplane(50) {
            @Override
            public String name() {
                return "";
            }
        };


        for (int i = 0; i < flyers.length; i++) {
            Flyable flyer = flyers[i];

            flyer.fly();

            if (flyer instanceof Airplane airplaneCurrent) {
                System.out.printf("Вместимость самолета: %s%n", airplaneCurrent.getCapacity());
                airplaneCurrent.takePassenger();
            }
        }

        System.out.println("\n ============== SWIM ============\n");
        Swimable[] swimmers = new Swimable[3];
        swimmers[0] = boat;
        swimmers[1] = duck;
        swimmers[2] = new Duck("красная");

        for (int i = 0; i < swimmers.length; i++) {
            Swimable swimmer = swimmers[i];

            swimmer.swim();
            // Вывести в консоль цвет всех уток

            if (swimmer instanceof Duck) {
                Duck duck1 = (Duck) swimmer;
                System.out.println("Я утка с цветом " + duck1.getColor());
            }

        }


    }
}