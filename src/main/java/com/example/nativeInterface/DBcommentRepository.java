package com.example.nativeInterface;

import org.springframework.stereotype.Component;

@Component
public class DBcommentRepository  implements Commentrepository {
    public void storeComment(comment c){
        System.out.println("the comment is created by "+c.getAuthor());
    }
}
