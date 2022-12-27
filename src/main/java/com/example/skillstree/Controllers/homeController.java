package com.example.skillstree.Controllers;

import com.example.skillstree.config.Config;
import jakarta.persistence.EntityManager;
import jakarta.persistence.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class homeController
    {

   @GetMapping("/")
    public String printHello(Model model){
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "home";
    }
}
