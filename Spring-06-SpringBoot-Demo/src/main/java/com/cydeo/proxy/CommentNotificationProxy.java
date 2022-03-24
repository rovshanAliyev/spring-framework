package com.cydeo.proxy;

import com.cydeo.proxy.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);

}
