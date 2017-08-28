package controller;

import dao.UserDAO;
import dao.UserDAOService;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class RegistrationController {

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String login(HttpSession session, HttpServletResponse response, String login, String email, String pass, String pass2, Model model) throws IOException {
        UserDAOService userDAOService = new UserDAOService(new UserDAO());
        if ((userDAOService.getByLogin(login) == null) && (pass.equals(pass2)) && (!(login.equals("")) && !(email.equals("")) && !(pass.equals("")) && !(pass2.equals("")) )) {
            User u = new User(login, email, pass);
            userDAOService.add(u);
            session.setAttribute("login", login);
            response.sendRedirect("/");
            return null;
        }else if (userDAOService.getByLogin(login) != null){
            model.addAttribute("error", "User already exists!");
            return "login";
        }else if ((login.equals("")) && (email.equals("")) && (pass.equals("")) && (pass2.equals(""))){
            model.addAttribute("error", "Please fill empty fields!");
            return "login";
        }else if (login.equals("")){
            model.addAttribute("error", "Please fill name field!");
            return "login";
        }else if (email.equals("")){
            model.addAttribute("error", "Please fill email field!");
            return "login";
        }else if (pass.equals("")){
            model.addAttribute("error", "Please fill password field!");
            return "login";
        }else if (pass2.equals("")){
            model.addAttribute("error", "Please repeat password!");
            return "login";
        }else if (!pass.equals(pass2)){
            model.addAttribute("error", "Passwords not equal!");
            return "login";
        }else {
            model.addAttribute("error", "Incorrect creditals!");
            return "login";
            }
        }
    }
