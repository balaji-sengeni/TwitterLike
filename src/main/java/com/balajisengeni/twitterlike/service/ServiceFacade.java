package com.balajisengeni.twitterlike.service;

import com.balajisengeni.twitterlike.domain.Post;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
//Facade pattern
public class ServiceFacade {
    private static ServiceFacade instance = new ServiceFacade();

    private ServiceFacade() { }

    public static ServiceFacade getService() {
        return instance;
    }

    public void post(String message, String posterName) {
        PostService.getInstance().execute(message, posterName);
    }

    public List<Post> getTimeline(String userName) {
        return ReadService.getInstance().getTimeline(userName);
    }

    public void follow(String followerName, String followeeName) {
        FollowService.getInstance().execute(followerName, followeeName);
    }

    public List<Post> getWall(String userName) {
        return WallService.getInstance().getWall(userName);
    }

}
