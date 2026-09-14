package com.example.nativeInterface;

import org.springframework.stereotype.Component;

@Component
public class emailCommentNotificationProxy implements CommentNotificationProxy {
    public void sendComment(comment c) {
        System.out.println("sending comment " + c.getText());
    }
}
