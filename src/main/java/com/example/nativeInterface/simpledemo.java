package com.example.nativeInterface;

interface Commentrepository{
    void storeComment(comment c);
}

interface CommentNotificationProxy{
    void sendComment(comment c);
}

class DBcommentRepository implements Commentrepository{
    public void storeComment(comment c){
        System.out.println("the comment is created by "+c.getAuthor());
    }
}
class emailCommentNotificationProxy implements CommentNotificationProxy{
    public void sendComment(comment c){
        System.out.println("sending comment "+c.getText());
    }
}
class commentService{
    private final CommentNotificationProxy notifcationProxy;
    private final Commentrepository repository;
    commentService(Commentrepository c,CommentNotificationProxy p){
        notifcationProxy = p;
        repository = c;
    }
   public void publishComment(comment c){
        notifcationProxy.sendComment(c);
        repository.storeComment(c);
   }
}
public class simpledemo {
    public static void main(String[] args) {
        commentService service = new commentService(new DBcommentRepository(),new emailCommentNotificationProxy());
        comment test = new comment();
        test.setAuthor("bluecyan");
        test.setText("This is a test");
        service.publishComment(test);
    }
}
