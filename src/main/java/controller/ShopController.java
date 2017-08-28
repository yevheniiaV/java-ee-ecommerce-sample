package controller;

import dao.ItemDAO;
import dao.ItemDAOService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

    ItemDAOService itemDAOService = new ItemDAOService(new ItemDAO());
    @RequestMapping("/shop.html")
    public String goToShopPage(Model model) {
        if (itemDAOService.getAll() != null){
          model.addAttribute("items", itemDAOService.getAll());
        }
        return "shop";
    }

}


