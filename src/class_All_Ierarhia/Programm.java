package class_All_Ierarhia;


public class Programm {
    public static void main(String[] args) {
// Иерархия наследования и преобразование типов
        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();
        Person alice = new Employee("Alice", "Google");
        alice.display();


        Object kolia = new Employee("Kolia", "Oracle");
        // Нисходящее преобразование от Object к типу Employee
        Employee emp = (Employee) kolia;
        emp.display();
        System.out.println(emp.getCompany());
    }
}
// Класс человека
class Person{
    private  String name;
    public String getName(){return name;}
    public Person(String name){
        this.name = name;
    }
    public void display(){
        System.out.printf("Person %s \n", name);
    }
}
// Служащий некоторой компании
class Employee extends Person{
    private String company;
    public Employee(String name, String company){
        super(name);
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    public void display(){
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
class Client extends Person{
    private int sum; // Переменная для хранения суммы на счете
    private String bank;
    public Client(String name, String bank, int sum){
        super(name);
        this.bank = bank;
        this.sum = sum;
    }
    public void display(){
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }
    public String getBank(){
        return bank;
    }
    public int getSum() {
        return sum;
    }
}

