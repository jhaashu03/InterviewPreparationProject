package MyProjects.Interview.OnlineBookReaderSystem;

import java.util.HashMap;

public class UserManager {
    private HashMap<Integer, User> users;

    public UserManager(){
        users= new HashMap<>();
    }

    public boolean addUser(User user){
        if(users.containsKey(user.getUserId()))
            return false;
        users.put(user.getUserId(),user);
        return true;
    }

    public boolean removeUser(User user){
        if(!users.containsKey(user.getUserId()))
            return false;
        users.remove(user.getUserId());
        return true;
    }

    public User findUser(int id){
        return users.get(id);
    }
}
