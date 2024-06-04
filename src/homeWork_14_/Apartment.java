
package homeWork_14_;
/*
@ data 03.06.2024
@ author Alla Novytska
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.
Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.
    */



public class aApartment {
    private int area;
    private int numberOfRooms;
    private int floor;
    private String address;
    private int bus;
    boolean balkon;

    // Конструктор
    public Apartment(int area, int numberOfRooms, int floor, boolean balkon, int bus, String address) {
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.address = address;
        this.balkon = balkon;
        this.bus = bus;

        System.out.println("Размер квартиры: " + area);
        System.out.println("Количество комнат: " + numberOfRooms);
        System.out.println("Этаж: " + floor);
        System.out.println("Наличие Балкона / Террасы: " + balkon);
        System.out.println("Адрес: " + address);
        System.out.println("Номер автобуса: " + bus);

        System.out.println("\n============================\n");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Apartment apartment = new Apartment(100, 3, 1, true, 2, "Hameln, Bergstreet,1");
        System.out.println("Город: " + apartment.address);
    }
}

/* Ответ консоли;
Размер квартиры: 100
Количество комнат: 3
Этаж: 1
Наличие Балкона / Террасы: true
Адрес: Hameln, Bergstreet,1
Номер автобуса: 2

============================

Город: Hameln, Bergstreet,1

Process finished with exit code 0
 */