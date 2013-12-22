package com.balajisengeni.twitterlike.interpreter;

import com.balajisengeni.twitterlike.domain.Post;

import static com.balajisengeni.twitterlike.service.ServiceFacade.getService;
import static com.balajisengeni.twitterlike.util.PostPrintHelper.getStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 22/12/2013
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 */
public class WallExpression implements ProcessPost, Interpreter {
    private String userName;

    public WallExpression(String userName) {
        this.userName = userName;
    }

    public StringBuilder interpret() {
        return getStringBuilder(getService().getWall(userName), this);
    }

    @Override
    public String evaluatePost(Post post) {
        return post.getPoster().toString() + " - " + post.toString();
    }
}
