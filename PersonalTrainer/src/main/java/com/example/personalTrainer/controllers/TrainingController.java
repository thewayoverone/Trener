package com.example.personalTrainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trainings")
public class TrainingController {

    @GetMapping()
    public String trainingsMain() {
        return "views/trainings/trainings-main";
    }

    @GetMapping("/training1")
    public String trainingDir1() {
        return "views/trainings/tdir1";
    }

    @GetMapping("/training2")
    public String trainingDir2() {
        return "views/trainings/tdir2";
    }

    @GetMapping("/training3")
    public String trainingDir3() {
        return "views/trainings/tdir3";
    }

}
