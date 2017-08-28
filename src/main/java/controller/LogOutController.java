package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
public class LogOutController {
    @RequestMapping(value = "/logout.html", method = RequestMethod.GET)
    public String logOut(HttpSession session, HttpServletResponse response) throws IOException {
        if (session.getAttribute("login") != null) {
            session.removeAttribute("login");
        }
        response.sendRedirect("/");
        return null;    }
}
