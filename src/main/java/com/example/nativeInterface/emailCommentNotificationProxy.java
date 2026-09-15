package com.example.nativeInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//use primary as default
@Qualifier("email")
public class emailCommentNotificationProxy implements CommentNotificationProxy {
    public void sendComment(comment c) {
        System.out.println("sending comment " + c.getText()+" by email");
    }
}
