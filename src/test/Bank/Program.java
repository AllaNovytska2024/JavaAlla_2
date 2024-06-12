package test.Bank;



public class Program {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam","Le Brothers");
        sam.display();
        Employee gans = new Employee("Gans", "Le Brothers");
        gans.display();
        Client bob = new Client("Bob", "Le Brothers" );
        bob.display();
        Client lidiia = new Client("Lidiia", "Pension");
        lidiia.display();



    }
}
 class Person {
    private String name;
    public String getName(){return name;}
    public Person(String name){
        this.name = name;
    }
    public  void display(){
        System.out.printf("Person %s \n", name);
    }
}
class Employee extends Person {
    private String bank;
    public Employee(String name, String company){
        super(name);
        this.bank = company;
    }
    public void display(){
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
class Client extends Person{
    private String bank;
    public Client(String  name, String company){
        super(name);
        this.bank = company;
    }
    public void display(){
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }

}
