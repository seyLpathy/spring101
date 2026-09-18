package com.example.controller;

import com.example.service.LoggedUserManagementService;
import com.example.service.LoginCountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope
//@SessionScope
public class LoginProcessor {
    private final LoggedUserManagementService managementService;
    private final LoginCountService countService;
    private String username;
    private String password;
    int id;
    LoginProcessor(LoggedUserManagementService managementService,LoginCountService countService) {
        //using instance hash to prove that spring creates instance for each http request
        this.id =this.hashCode();
        this.managementService = managementService;
        this.countService = countService;

    }
    public boolean login(){
        countService.increment();
        String username = this.username;
        String password = this.password;
        if( "natalie".equals(username) && "password".equals(password)){
            managementService.setUsername(username);
            return true;
        }
        return false;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return this.id;
    }
}
