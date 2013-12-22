package com.balajisengeni.twitterlike.repository;

import com.balajisengeni.twitterlike.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:32
 * To change this template use File | Settings | File Templates.
 */
public class UserRepository {
    private final static UserRepository instance = new UserRepository();
    private final Map<String, User> users = new HashMap<String, User>();

    private UserRepository() { }

    public static UserRepository getUserRepository() {
        return instance;
    }

    public User getUserByName(String name) {
        if (users.containsKey(name)) {
            return users.get(name);
        } else {
            User user = new User(name);
            users.put(name,user);
           return user;
        }
    }
}
