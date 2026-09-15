package com.example.spring101;

import com.example.animals.Hero;
import com.example.animals.Parrot;
import com.example.configs.ProjectConfig;
import com.example.initialization.bird;
import com.example.initialization.fish;
import com.example.nativeInterface.comment;
import com.example.nativeInterface.commentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring101Application {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p1 = context.getBean("redparrot",Parrot.class);
        System.out.println(p1.getName());
        int id = context.getBean(Integer.class);
        System.out.println(id);
        String hello = context.getBean(String.class);
        System.out.println(hello);
        Hero h1 = context.getBean(Hero.class);
        System.out.println(h1.getName());
        System.out.println(h1.getParrot().getName());

        comment c = context.getBean(comment.class);
        c.setAuthor("bluecyan");
        c.setText("simple test for springboot");
        //prove that default beans is singleton type
        commentService service= context.getBean(commentService.class);
        commentService service2= context.getBean(commentService.class);
        System.out.println(service2==service);
        service.publishComment(c);
        // prove that a bean is instanced when app creates the spring context
        // use lazy annotation to instruct the spring to create instance lazily
        // using prototype annotation
        fish shark = context.getBean(fish.class);
        fish shark2 = context.getBean(fish.class);
        System.out.println(shark==shark2);
    }

}
