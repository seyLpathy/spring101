package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope
//@SessionScope
public class LoginProcessor {
    private String username;
    private String password;
    int id;
    LoginProcessor() {
        //using instance hash to prove that spring creates instance for each http request
        this.id =this.hashCode();
    }
    public boolean login(){
        String username = this.username;
        String password = this.password;
        return "natalie".equals(username) && "password".equals(password);
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
