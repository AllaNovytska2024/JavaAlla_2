package training_Java_Alla;

import org.w3c.dom.css.Counter;

public class Program {

    public static void main(String[] args) {
        Person.displayCounter(); // counter : 1

        Person dik = new Person(); // 2
        Person anatol = new Person(); // 103

        dik.displayId();  // 2
        anatol.displayId(); // 3
        Person.displayCounter(); // Counter : 3


        Person testo = new Person();
          testo.displayId();
       //  testo.displayName();
       //  testo.displayAge();
      //  testo.displayAddress();
         testo.displayInfo();
       // System.out.println(testo.id);
        System.out.println(testo.name);
        System.out.println(testo.age);
        System.out.println(testo.address);
       // System.out.println(testo.phone); // сделано недоступным private

        Person bob = new Person(6,"Bob", 18,"Bergstr,33", "160-567-99-88");
        bob.displayInfo();

        Person lidiia = new Person(7,"Lidiia", 86, "Germany", "150-999-88-77");
        lidiia.displayInfo();

        Person sam = new Person(4,"Sam",28,"non", "non");
        sam.displayInfo();

        Person diana = new Person(5,"Diana", 30, "Hessisch Oldendorf", "160-88-99-00");
        diana.displayInfo();

        Person mary = new Person( 100,"Mary", 21,"non","non");
        mary.displayInfo();




    }
}
class Person {

    String name;
    protected int age;
    public String address;
    private String phone;

    private int id;
    private static int counter = 1;
    static{
        counter = 1;
        System.out.println("Static initializer");
    }
    Person(){
        id = counter ++;
        System.out.println("Constructor");
    }
    public static void displayCounter(){
        System.out.printf("Counter: %d \n", counter);
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
    public Person(int id, String name, int age, String address, String phone){
        this.id = id;

        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    {
        int id = 1;
        String name = "testo-non";
        age = 0;
        address = "Street-non";
        phone = "Don't";
    }

    void displayInfo(){
        System.out.printf("Id: %d \nName: %s \tAge: %d\tAddress: %s\tPhone: %s\n", id, name, age, address, phone);


        System.out.println("/n------------------------------------------/n");


     }
 }




