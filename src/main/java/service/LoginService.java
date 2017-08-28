package service;

import dao.UserDAO;
import dao.UserDAOService;
import entity.User;

public class LoginService {
    public User correctUserExists(String login, String pass){
        UserDAOService udao = new UserDAOService(new UserDAO());
        User u = udao.getByLogin(login);
        if(u==null){
            return null;
        }else{
            if(u.getPass().equals(pass)){
                return u;
            }else{
                return null;
            }
        }
        
    }
}
