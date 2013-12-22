package com.balajisengeni.twitterlike.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:00
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String name;
    private final Set<User> followees = new HashSet<User>();

    public User(String name) {
        this.name = name;
    }

    public void follow(User followee) {
        this.followees.add(followee);
    }

    public Set<User> getFollowees() {
        return followees;
    }

    @Override
    public String toString() {
        return name;
    }
}
