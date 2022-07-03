package com.example.personalTrainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trainings")
public class TrainingActivityController {

    @GetMapping("/training1-act1")
    public String training1Act1() {
        return "views/activities/tdir1-act1";
    }

    @GetMapping("/training1-act2")
    public String training1Act2() {
        return "views/activities/tdir1-act2";
    }

    @GetMapping("/training1-act3")
    public String training1Act3() {
        return "views/activities/tdir1-act3";
    }

    @GetMapping("/training2-act1")
    public String training2Act1() {
        return "views/activities/tdir2-act1";
    }

    @GetMapping("/training2-act2")
    public String training2Act2() {
        return "views/activities/tdir2-act2";
    }

    @GetMapping("/training2-act3")
    public String training2Act3() {
        return "views/activities/tdir2-act3";
    }

    @GetMapping("/training3-act1")
    public String training3Act1() {
        return "views/activities/tdir3-act1";
    }

    @GetMapping("/training3-act2")
    public String training3Act2() {
        return "views/activities/tdir3-act2";
    }

    @GetMapping("/training3-act3")
    public String training3Act3() {
        return "views/activities/tdir3-act3";
    }
}
