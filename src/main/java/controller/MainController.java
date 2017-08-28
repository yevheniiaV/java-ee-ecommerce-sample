package controller;

import dao.ItemDAO;
import dao.ItemDAOService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    ItemDAOService itemDAOService = new ItemDAOService(new ItemDAO());

    @RequestMapping({"/index.html","/"})
    public String goToIndexPage(HttpSession session, Model model){
        if (itemDAOService.getAll() != null){
            model.addAttribute("items", itemDAOService.getAll());
        }
        if (session.getAttribute("login") != null) {
            String login = (String)session.getAttribute("login");
            model.addAttribute("login", login);
        }
           return "index";
    }

}

