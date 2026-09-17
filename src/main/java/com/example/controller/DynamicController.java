package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DynamicController {
    @RequestMapping("/home1/{message}")
    public String home1(@PathVariable String message, @RequestParam String color, Model page){
        page.addAttribute("message", message);
        page.addAttribute("color",color);
        return "home1.html";

    }
}
