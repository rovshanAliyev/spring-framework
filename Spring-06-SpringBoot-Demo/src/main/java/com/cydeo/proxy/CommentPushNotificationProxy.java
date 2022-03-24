package com.cydeo.proxy;

import com.cydeo.proxy.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment : " + comment.getText());
    }
}