package com.balajisengeni.twitterlike.interpreter;

import com.balajisengeni.twitterlike.domain.Post;

import static com.balajisengeni.twitterlike.service.ServiceFacade.getService;
import static com.balajisengeni.twitterlike.util.PostPrintHelper.getStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:30
 * To change this template use File | Settings | File Templates.
 */
public class ReadExpression implements ProcessPost, Interpreter {
    private String userName;
    public ReadExpression(String userName) {
        this.userName = userName;
    }
    public StringBuilder interpret() {
        return getStringBuilder(getService().getTimeline(userName), this);
    }

    @Override
    public String evaluatePost(Post post) {
        return post.toString();
    }
}
