package shop.project_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
    @RequestMapping("/shop")
    public String home(Model model){
        return "shop";

    }
}
