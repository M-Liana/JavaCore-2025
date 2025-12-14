package classwork.library.storage;

import classwork.library.model.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {

    private Map<String, User> userMap = new HashMap<>();

    public void register(User user) {
        String email = user.getEmail().trim();
        userMap.put(email, user);
    }

    public User getUserByEmail(String email){
        return userMap.get(email);
    }

    public void printAllUsers() {
        for (User value : userMap.values()) {
            System.out.println(value);

        }
    }

    public void removeByEmail(String userEmail) {
        userMap.remove(userEmail);

    }
}
