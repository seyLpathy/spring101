package com.example.nativeInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("message")
public class messageCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(comment c) {
        System.out.println("sending comment "+c.getText() + " by message");
    }
}
