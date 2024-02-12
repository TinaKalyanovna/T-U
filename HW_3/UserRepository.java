package HW_3;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        user.isAuthenticateVerify(user.name, user.password);
        if (user.isAuthenticate) {
            users.add(user);
        }
    }

//    метод поиска пользователя по имени
    public boolean findByName(String username) {
        for (User user : users) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

//    метод, который разлогинивает пользователей, кроме администратора
    public void logOutAllExceptAdmins() {
        for (User user : users) {
            if (!user.isAdmin) {
                user.logOut();
            }
        }
    }

//    метод, который разлогинивает всех пользователей
    public void logOutAll() {
        for (int i = 0; i < users.size(); i++) {
            users.get(i).isAuthenticate = false;
        }
    }
}
