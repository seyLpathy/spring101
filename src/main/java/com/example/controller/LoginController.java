package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginprocessor;
    static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    public LoginController(LoginProcessor loginprocessor) {
        this.loginprocessor = loginprocessor;
    }

    @GetMapping("/login")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/login")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ){
        //using annotation requestscope so the id is the same
        logger.info("current processor's hashcode is {}", loginprocessor.getId());
        loginprocessor.setUsername(username);
        loginprocessor.setPassword(password);
        boolean loggedIn = loginprocessor.login();

        if (loggedIn){
            return "redirect:/main";

        }else{
            model.addAttribute("message", "Login failed");
        }

        return "login.html";
    }
}
