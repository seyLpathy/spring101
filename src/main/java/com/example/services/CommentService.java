package com.example.services;

import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;

@Component
public class CommentService {
    CommentService(){
        System.out.println("Comment Service is working");
    }
    public void publishComment() {
        System.out.println("demo comment published");

    }
}
