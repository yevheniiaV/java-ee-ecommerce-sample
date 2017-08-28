package controller;

import dao.*;
import entity.Cartitem;
import entity.Item;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CartController {

    CartItemDAOService cartItemDAOService = new CartItemDAOService(new CartItemDAO());
    User user;
    UserDAOService userDAOService = new UserDAOService(new UserDAO());
    Item item;
    ItemDAOService itemDAOService = new ItemDAOService(new ItemDAO());
    Cartitem cartitem;

    @RequestMapping("/cart.html")
    public String goToCartPage(Model model, int productId) {
        if (itemDAOService.getById(productId) != null){
            model.addAttribute("item", itemDAOService.getById(productId));
        }
        return "cart";
    }

    @RequestMapping("/cart.html/add")
    public String addItemToCart(Model model, int productId, HttpSession session) {

        String login = (String) session.getAttribute("login");
        user = userDAOService.getByLogin(login);
        item = itemDAOService.getById(productId);
        cartitem = new Cartitem(user, item, 1);

        Cartitem cartItem = cartItemDAOService.getByItem(productId);
        List <Cartitem> listOfCartItems = cartItemDAOService.getByUser(user.getId());
        System.out.println(cartItem);
        if (listOfCartItems != null){
            if (cartItem != null) {
            cartItemDAOService.updateAddingQuantityOfItem(productId);
            }
        } else{
            cartItemDAOService.add(cartitem);
        }


        model.addAttribute("cartitems", listOfCartItems); //Redirect to cart

    return "cart";
    }

    @RequestMapping("/cart.html/minus")
    public String minusOneItem(int productId, HttpSession session) {
        Cartitem cartItem = cartItemDAOService.getByItem(productId);
        String login = (String) session.getAttribute("login");
        user = userDAOService.getByLogin(login);
        List <Cartitem> listOfCartItems = cartItemDAOService.getByUser(user.getId());
        if (listOfCartItems != null){
            if (cartItem != null){
                cartItemDAOService.updateSubstractingQuantityOfItem(productId);
            }
        }
        return "cart";
    }

}
