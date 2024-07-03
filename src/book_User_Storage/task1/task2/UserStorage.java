package book_User_Storage.task1.task2;


import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    public List<User> createStorage(){
      User user1 = new User(1,"Ruslan","admin@comany.com","12345");
        User user2 = new User(2,"Victor","victor@comany.com","22222");
        User user3 = new User(3,"Olga","olga@comany.com","333333");
        User user4 = new User(4,"Roman","roman@comany.com","444444");
        User user5 = new User(5,"John","john@comany.com","55555");


        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        return users;
    }
}