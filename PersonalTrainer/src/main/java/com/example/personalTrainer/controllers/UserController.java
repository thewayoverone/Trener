package com.example.personalTrainer.controllers;

import com.example.personalTrainer.models.User;
import com.example.personalTrainer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String showAllUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "views/admin/user/user-list";
    }

    @GetMapping("/new")
    public String newUserForm(@ModelAttribute("user") User user) {
        return "views/admin/user/user-create";
    }

    @PostMapping()
    public String createNewUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/admin/users";
    }

    @GetMapping("/{id}/edit")
    public String editUserForm(Model model, @PathVariable("id") Long id) {
        model.addAttribute("user", userService.findById(id));
        return "views/admin/user/user-edit";
    }

//    @PostMapping("/{id}")
//    public String editUser(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
////    public String editUser(User user) {
//        userService.saveUser(user);
//        return "redirect:/admin/users";
//    }

    @PatchMapping("/{id}")
    public String editUser(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
//    public String editUser(User user) {
        userService.saveUser(user);
        return "redirect:/admin/users";
    }


    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/admin/users";
    }
}
