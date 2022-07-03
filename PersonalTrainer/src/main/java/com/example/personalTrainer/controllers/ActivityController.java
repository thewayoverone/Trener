package com.example.personalTrainer.controllers;

import com.example.personalTrainer.models.Activity;
import com.example.personalTrainer.models.User;
import com.example.personalTrainer.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping()
    public String showAllActivities(Model model) {
        List<Activity> activities = activityService.findAll();
        model.addAttribute("activities", activities);
        return "views/admin/activity/activity-list";
    }

    @GetMapping("/new")
    public String createActivityForm() {
        return "";
    }

//    @PostMapping()
//    public String createNewActivity(@ModelAttribute("activity") Activity activity,
//                                    @RequestParam Long userID) {
//        return "redirect:/admin/activities";
//    }
//
//    @PostMapping()
//    public String completeActivity(@ModelAttribute("activity") Activity activity,
//                                   @RequestParam Long activityID) {
//        return "redirect:/admin/activities";
//    }
}
