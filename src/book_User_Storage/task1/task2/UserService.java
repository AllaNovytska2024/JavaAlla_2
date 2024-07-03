package book_User_Storage.task1.task2;



import java.util.List;

public class UserService {

    private UserStorage storage = new UserStorage();
    private List<User> users = storage.createStorage();


    public void printUserData() {
        for (int i = 0; i < users.size(); i++) {
            User currentUser = users.get(i);
            System.out.println("Name: " + currentUser.getUsername() + ", user email: " + currentUser.getEmail());
        }
    }


    public User findById(Integer id) {

        if (id > 0 && id < users.size()) {
            for (User user : users) {
                if (user.getUserId().equals(id)) {
                    return user;
                }
            }
        }

        return null;
    }

}