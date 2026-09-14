package com.example.nativeInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface Commentrepository{
    void storeComment(comment c);
}

interface CommentNotificationProxy{
    void sendComment(comment c);
}

public class simpledemo {
    public static void main(String[] args) {

    }
//        commentService service = new commentService(new DBcommentRepository(),new emailCommentNotificationProxy());
//        comment test = new comment();
//        test.setAuthor("bluecyan");
//        test.setText("This is a test");
//        service.publishComment(test);
}
