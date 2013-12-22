package com.balajisengeni.twitterlike.service;
import static com.balajisengeni.twitterlike.repository.UserRepository.getUserRepository;
import static com.balajisengeni.twitterlike.repository.PostRepository.*;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 */
public class PostService {
    private static PostService instance = new PostService();

    private PostService() { }

    public static PostService getInstance() {
        return instance;
    }

    public void execute(String message, String posterName) {
        getPostRepository().addPost(message, getUserRepository().getUserByName(posterName));
    }
}
