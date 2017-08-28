package service;

import com.google.gson.Gson;
import dao.UserDAO;
import dao.UserDAOService;
import entity.Cart;
import entity.User;


public class RegisterService {
    public User createUser(String login, String pass){
        return new User(login, pass, new Gson().toJson(new Cart()));
    }
    public boolean isUserExists(String login){
        UserDAOService udao = new UserDAOService(new UserDAO());
        if(udao.getByLogin(login) == null){
            return false;
        }else return true;
    }
}
