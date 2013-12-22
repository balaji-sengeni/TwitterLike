package com.balajisengeni.twitterlike.interpreter;

import static com.balajisengeni.twitterlike.service.ServiceFacade.getService;
/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 22/12/2013
 * Time: 10:18
 * To change this template use File | Settings | File Templates.
 */
public class FollowExpression implements Interpreter {
    private String followerName, followeeName;

    public FollowExpression(String followerName, String followeeName) {
        this.followerName = followerName;
        this.followeeName = followeeName;
    }

    public StringBuilder interpret() {
        getService().follow(followerName, followeeName);
        return null;
    }
}
