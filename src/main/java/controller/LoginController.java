package controller;

import dao.UserDAO;
import dao.UserDAOService;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class LoginController {

    boolean isLogUser = false;

    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String goToLoginPage() {
    return "login";
    }

    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    public String login(String login, String pass, HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        UserDAOService userDAOService = new UserDAOService(new UserDAO());
        User res = userDAOService.getByLogin(login);
        if (res != null && (!(login.equals("") &&(pass.equals("")))) && res.getPass().equals(pass)) {
            isLogUser = true;
            request.getSession().setAttribute("login", login);
            response.sendRedirect("/");
            return null;
        } else if((login.equals("")) && pass.equals("")){
            model.addAttribute("errorLogin", "Please fill empty fields!");
            return "login";
        }else if(login.equals("")){
            model.addAttribute("errorLogin", "Please fill login field!");
            return "login";
        }else if(pass.equals("")){
            model.addAttribute("errorLogin", "Please fill password field!");
            return "login";
        } else {
            model.addAttribute("errorLogin", "Incorrect credentials!");
            return "login";
        }
}
}
