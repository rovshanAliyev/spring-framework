package com.cydeo.repository;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("Sending notification : "+comment.getText());
    }
}
