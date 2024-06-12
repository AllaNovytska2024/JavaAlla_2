package training_Java_Alla.Set_Persons;

public class Program {
    public static void main(String[] args) {

        Person kate = new Person( 1, "Kate", 30, " set-address", "set-phone");

        System.out.println(kate.getAge()); //30
        kate.setAge(33);
        System.out.println(kate.getAge()); //33
        kate.setAddress("Munhen, Bergstr,31");
        System.out.println(kate.getAddress()); //"Munhen, Bergstr,31"
        kate.setPhone("+49 150-00-00-00");
        System.out.println(kate.getPhone()); // "+49 150-00-00-00"

        System.out.println(kate.getName()); // Kate
        changeName(kate);
        System.out.println(kate.getName()); // Alice



        kate.displayId(); // Id =1
        System.out.println(Person.counter);
        Person.counter = 8;

        Person sam = new Person();


        sam.displayId();  // Id =8
        }

        static void changePerson(Person p) {
        p = new Person();  // указывает на новый объект
        p.setName("Ann");
        } //

        static void changeName(Person p){
            p.setName("Alice");
        }

    }



 class Person {
            Account account;
            Person(String name, String password){
                this.name = name;
                account = new Account(password);
            }
            public void displayPerson(){
                System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password );
            }
            public class Account{
                private String password;
                Account(String pass){
                    this.password = pass;
                }


                void displayAccount(String password){
                    System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
                }
            }


            private  int id;
            private String name;
            private int age = 1;
            private String address;
            private String phone;

            static int counter;
            static{
                counter = 1;
                System.out.println("Static initializer");
            }

            public Person(int id, String name, int age, String address, String phone) {

                 int counter = 1;

                //   setId(id);

                setName(name);
                setAge(age);
                setAddress(address);
                setPhone(phone);
            }
            public void getAccount(){

            }
            public int getId(){
                return this.id;
            }
            public void setId(){
                this.id = id;
            }
            Person(){
                id = counter++;


            }
            public void displayId(){
                System.out.printf("Id: %d \n", id);
            }

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return this.age;
            }

            public void setAge(int age) {
                if (age > 0 && age < 150)
                    this.age = age;
            }

            public  String getAddress(){
                return this.address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getPhone(){
                return this.phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

        }

