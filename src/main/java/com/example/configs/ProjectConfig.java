package com.example.configs;

import com.example.animals.Parrot;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.animals")
public class ProjectConfig {
    @Bean
    @Primary
    //make this bean method the default
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("kimi");
        return p;
    }
    @Bean
    Parrot blueParrot(){
        Parrot p = new Parrot();
        p.setName("blue");
        return p;
    }
    @Bean("redparrot")
    //change name by bean anotation arguments
    Parrot red(){
        Parrot p = new Parrot();
        p.setName("ginger");
        return p;
    }

    @Bean
    Parrot blueparrot(){
        Parrot p = new Parrot();
        p.setName("jomi");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    int id(){
        return 1;
    }

}
