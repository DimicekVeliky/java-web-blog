package com.project.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Support {
    @GetMapping("/support")
    public String support(Model model) {
        return "support";
    }
}
