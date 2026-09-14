package com.example.animals;

import org.springframework.context.annotation.Bean;

public class Parrot {
    String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
