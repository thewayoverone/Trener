package com.example.personalTrainer.controllers;

import com.example.personalTrainer.models.Content;
import com.example.personalTrainer.services.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/contents")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping()
    public String showAllContent(Model model) {
        List<Content> contentList = contentService.findAll();
        model.addAttribute("contents", contentList);
        return "views/admin/content/content-list";
    }
}
