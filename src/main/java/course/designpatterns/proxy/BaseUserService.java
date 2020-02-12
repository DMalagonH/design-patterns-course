package course.designpatterns.proxy;

import java.util.ArrayList;

// Sujeto real
public class BaseUserService implements UserService {

    private ArrayList<String> users;

    public BaseUserService() {
        users = new ArrayList<>();
    }

    @Override
    public boolean save(String username) {
        boolean result = false;
        if(!users.contains(username)) {
            users.add(username);
            result = true;
        }
        return result;
    }
}
