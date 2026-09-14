package com.example.animals;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hero {
    String name="brute";
    private final Parrot parrot;
    //dependecies injected by context
    @Autowired
    Hero(@Qualifier("blueParrot") Parrot parrot) {
        this.parrot = parrot;
    }
    public Parrot getParrot(){
        return parrot;
    }
    // function called by default when bean is created
    @PostConstruct
    void shelter(){
        name="ciel";
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
