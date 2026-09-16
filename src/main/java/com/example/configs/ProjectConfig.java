package com.example.configs;

import com.example.AOP.LoggingAspect;
import com.example.animals.Parrot;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.example")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    LoggingAspect aspect(){
        return new LoggingAspect();
    }
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

}
