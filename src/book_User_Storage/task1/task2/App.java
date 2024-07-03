package book_User_Storage.task1.task2;

public class App {
    public static void main(String[] args) {

       UserService service = new UserService();

       service.printUserData();

        System.out.println(service.findById(-1));



    }
}