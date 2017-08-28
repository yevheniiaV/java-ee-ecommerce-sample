package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 021 21.08.17.
 */

@Controller
public class CheckoutController {

    @RequestMapping("/checkout.html")
    public String goToCartPage() {
        return "checkout";
    }

}
