package com.example.javajspecommerce.web;

import com.example.javajspecommerce.constants.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("message", "a la aplicaicón base Spring Boot");
        return View.HOME.getPath();
    }

}
