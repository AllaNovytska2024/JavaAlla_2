package homeWork_20_Person_Sport;
/*
@ date 12.06.2024
@ author Alla Novytska

Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()).
Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class People_Sport {


        void run() {
            System.out.println("Человек бежит со скоростью 10 км");
        }
        int timeForRest() {
            return 15;
        }
    }

    class PersonSportLike extends People_Sport {
        @Override
        void run() {
            System.out.println("Спортсмен-любитель бежит со скоростью 15 км");
        }

        @Override
        int timeForRest() {
            return 10;
        }
    }

    class PersonSportProfi extends People_Sport {
        @Override
        void run() {
            System.out.println("Спортсмен-профи бежит со скоростью 25 км");
        }

        @Override
        int timeForRest() {
            return 5;
        }
    }

    class Main {
        public static void main(String[] args) {

            People_Sport peopleSport = new People_Sport();
            PersonSportLike personSportLike = new PersonSportLike();
            PersonSportProfi personSportProfi = new PersonSportProfi();

            peopleSport.run();
            System.out.println("Отдых: " + peopleSport.timeForRest() + " минут");

            personSportLike.run();
            System.out.println("Отдых: " + personSportLike.timeForRest() + " минут");

            personSportProfi.run();
            System.out.println("Отдых: " + personSportProfi.timeForRest() + " минут");
        }
    }



