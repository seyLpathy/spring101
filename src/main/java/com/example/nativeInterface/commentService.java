package com.example.nativeInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class commentService {
    private final CommentNotificationProxy notifcationProxy;
    private final Commentrepository repository;
    @Autowired
    commentService(Commentrepository c,CommentNotificationProxy p){
        notifcationProxy = p;
        repository = c;
    }
    public void publishComment(comment c){
        notifcationProxy.sendComment(c);
        repository.storeComment(c);
    }
}
