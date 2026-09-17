package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);
    @RequestMapping("/home")
    public String home(){
        logger.info("welcome to the main page");
        return "home.html";
    }
}
