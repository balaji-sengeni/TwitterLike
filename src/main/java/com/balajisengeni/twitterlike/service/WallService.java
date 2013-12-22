package com.balajisengeni.twitterlike.service;

import com.balajisengeni.twitterlike.domain.Post;
import com.balajisengeni.twitterlike.domain.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.balajisengeni.twitterlike.repository.PostRepository.getPostRepository;
import static com.balajisengeni.twitterlike.repository.UserRepository.getUserRepository;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 23:03
 * To change this template use File | Settings | File Templates.
 */
public class WallService {
    private static WallService instance = new WallService();

    private WallService() { }

    public static WallService getInstance() {
        return instance;
    }

    public List<Post> getWall(String userName) {
        User user = getUserRepository().getUserByName(userName);
        Set users = new HashSet(user.getFollowees());
        users.add(user);
        return getPostRepository().getPostsFor(users);
    }

}
