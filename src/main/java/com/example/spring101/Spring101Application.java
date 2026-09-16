package com.example.spring101;

import com.example.AOP.LoggingAspect;
import com.example.animals.Hero;
import com.example.animals.Parrot;
import com.example.configs.ProjectConfig;
import com.example.services.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring101Application {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        //this will be intercepted
        commentService.deleteComment();


    }

}
