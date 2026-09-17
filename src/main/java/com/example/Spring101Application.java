package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring101Application {

    public static void main(String[] args)
    {
        //this will be intercepted
        SpringApplication.run(Spring101Application.class, args);


    }

}
