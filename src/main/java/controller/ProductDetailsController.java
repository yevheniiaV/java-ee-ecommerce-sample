package controller;

import dao.ItemDAO;
import dao.ItemDAOService;
import entity.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 022 22.08.17.
 */
@Controller
public class ProductDetailsController {

    ItemDAOService itemDAOService = new ItemDAOService(new ItemDAO());

    @RequestMapping("/product-details.html")
    public String goToProductDetailsPage(int productId, Model model) {
        if(itemDAOService.getById(productId)!= null){
            Item item = itemDAOService.getById(productId);
            model.addAttribute("item", item);
        }
        return "product-details";
    }
}
