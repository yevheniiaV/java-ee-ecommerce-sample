package dao;

import entity.User;

import java.util.LinkedList;
import java.util.List;

public class UserDAOService {
    private final UserDAO udao;

    public UserDAOService(UserDAO udao) {
        this.udao = udao;
    }

    public List<User> get(){
        List<User> usersDAO = udao.get();
        List<User> out = new LinkedList<>();
        for(User u:usersDAO){
            out.add(u);
        }
        return out;
    }

    public void add(User user){
        udao.add(user);
    }

    public User getByLogin(String login){
        User u = udao.getByLogin(login);
        return u;
    }
}
