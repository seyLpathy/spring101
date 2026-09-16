package com.example.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;

@Component
public class CommentService {
    private final Logger logger = LoggerFactory.getLogger(CommentService.class);
    public void publishComment() {
        logger.info("Publishing comment");
    }
    public void deleteComment(){
        logger.info("Deleting comment");
    }
}
