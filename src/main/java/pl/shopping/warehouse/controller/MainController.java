package pl.shopping.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model){
        return "index";
    }
//    @GetMapping("/products")
//    public String warehouse(Model model){
//        return "warehouse";
//    }

    @PostMapping("/employee/register")
    public String register(Model model) {

        return "register";
    }
}
