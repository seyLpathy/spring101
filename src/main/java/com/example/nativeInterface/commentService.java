package com.example.nativeInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class commentService {
    private final CommentNotificationProxy notifcationProxy;
    private final Commentrepository repository;
    @Autowired
    commentService(Commentrepository c,@Qualifier("message") CommentNotificationProxy p){
        notifcationProxy = p;
        repository = c;
    }
    public void publishComment(comment c){
        notifcationProxy.sendComment(c);
        repository.storeComment(c);
    }
}
