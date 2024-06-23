package appartment;

class Apartments {
    private int area;
    private int numberOfRooms;
    private int floor;
    private String address;
    private int bus;
    boolean balkon;

    // Конструктор
    public Apartments(int area, int numberOfRooms, int floor, boolean balkon, int bus, String address) {
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
        System.out.println("Количество комнат: " + bus);

        System.out.println("\n============================\n");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Apartments apartment = new Apartments(100, 3, 5, true, 2, "Берлин, Гатестрит, 39");
        System.out.println("Город: " + apartment.address);
    }
}

