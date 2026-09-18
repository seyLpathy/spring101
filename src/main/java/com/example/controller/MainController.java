package com.example.controller;

import com.example.service.LoggedUserManagementService;
import com.example.service.LoginCountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);
    private final LoggedUserManagementService managementService;
    private final LoginCountService loginCountService;

    @Autowired
    public MainController(LoggedUserManagementService managementService, LoginCountService loginCountService) {
        this.managementService = managementService;
        this.loginCountService = loginCountService;
    }
    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @GetMapping("/main")
    public String main(@RequestParam(required = false) String logout, Model model){
        if (logout != null){
            managementService.setUsername(null);
        }
        String username = managementService.getUsername();
        int count = loginCountService.getCount();
        if (username == null) {
            return "redirect:/login";
        }
        model.addAttribute("username", username);
        model.addAttribute("logincount", count);
        return "main.html";
        }
}
