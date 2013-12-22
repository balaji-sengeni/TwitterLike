package com.balajisengeni.twitterlike.service;

import com.balajisengeni.twitterlike.domain.Post;

import java.util.List;

import static com.balajisengeni.twitterlike.repository.PostRepository.getPostRepository;
import static com.balajisengeni.twitterlike.repository.UserRepository.getUserRepository;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class ReadService {
    private static ReadService instance = new ReadService();
    private ReadService() { }

    public static ReadService getInstance() {
        return instance;
    }

    public List<Post> getTimeline(String userName) {
        return getPostRepository().getPostsFor(getUserRepository().getUserByName(userName));
    }
}
