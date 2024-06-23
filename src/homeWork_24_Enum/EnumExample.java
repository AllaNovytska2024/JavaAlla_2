package homeWork_24_Enum;

import lesson_24_Enum.Day;

public class EnumExample {

    public static void main(String[] args) {


        enum Season {
            SPRING(15), // средняя температура весной
            SUMMER(25), // средняя температура летом
            AUTUMN(10), // средняя температура осенью
            WINTER(0);  // средняя температура зимой

            private final int averageTemperature;

            Season(int averageTemperature) {
                this.averageTemperature = averageTemperature;
            }

            public int getAverageTemperature() {
                return averageTemperature;
            }


        }
    }
}




        /*
        Months today = Months.JANUARY;
        System.out.println(today);

        switch (today) {
            case JANUARY:
                System.out.println("Today is January");
                break;
            default:
                System.out.println("Какой-то другой месяц");
        }
        //Методы
        // Возвращает массив значений
        Months[] values = Months.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        System.out.println("\n========================\n");

        // Получить строковое значение
        String monthsStr = Months.JANUARY.toString();
        System.out.println(monthsStr);

        // Возвращает константу Enum с указанным именем
        Months someMonths = Months.valueOf("January".toUpperCase());
        System.out.println(someMonths);

        // Сравнение Enum. Для сравнения двух значений Enum можно безопасно использовать оператор ==
        System.out.println(someMonths == Months.JANUARY);

        // Возвращает порядковый номер константы (начиная с нуля)
        System.out.println(Months.MARCH.ordinal());
    }
}


        /*
        Planet mercury = Planet.MERCURY;

        System.out.println(mercury);

        System.out.println("mercury.getMass(): " + mercury.getMass());
        System.out.println("mercury.getRadius(): " + mercury.getRadius());

        String mercuryStr = Planet.MERCURY.toString();
        System.out.println("mercuryStr: " + mercuryStr);

        mercuryStr = Planet.MERCURY.name();
        System.out.println("Planet.MERCURY.name(): " + Planet.MERCURY.name());

*/
