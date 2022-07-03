package com.example.personalTrainer.controllers;

import com.example.personalTrainer.models.User;
import com.example.personalTrainer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    private UserService userService;


//    @GetMapping("/")
//    public String indexPage() {
//        return "views/main/index";
//    }
//
//    @GetMapping("/home")
//    public String homePage() {
//        return "views/main/home";
//    }


    @GetMapping("/registration")
    public String registrationForm(@ModelAttribute("user") User user) {
        return "views/main/registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("user") User user, Model model) {
        if (!userService.createUser(user)) {
            model.addAttribute("message", "Name " + user.getName() + " already exist");
            return "views/main/registration";
        }
        return "redirect:/login";
    }

//    @PostMapping("/registration")
//    public String registration(@ModelAttribute("user") User user, Model model) {
//        try {
//            if (userService.createUser(user)) return "redirect:/login";
//        } catch (UserAlreadyExistException e) {
//            model.addAttribute("message", e.getMessage());
//        }
//        return "/registration";
//    }
}



