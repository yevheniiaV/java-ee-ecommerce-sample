package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

    @RequestMapping("/blog.html")
    public String goToBlogPage() {
        return "blog";
    }

    @RequestMapping("/blog-single.html")
    public String goToBlogSinglePage() {
        return "blog-single";
    }
}
