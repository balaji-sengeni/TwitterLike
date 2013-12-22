package com.balajisengeni.twitterlike.repository;

import com.balajisengeni.twitterlike.domain.Post;
import com.balajisengeni.twitterlike.domain.User;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 */
public class PostRepository {
    private final static PostRepository instance = new PostRepository();
    private final Deque<Post> allPosts = new ArrayDeque<Post>();

    private PostRepository() { }

    public static PostRepository getPostRepository() {
        return instance;
    }

    public void addPost(String message, User poster) {
        allPosts.addFirst(new Post(message, poster));
    }

    public List<Post> getPostsFor(User poster) {
        return getPostsFor(new HashSet<User>(Arrays.asList(poster)));
    }

    public List<Post> getPostsFor(Set<User> posters) {
        List<Post> selectedPosts = new ArrayList<Post>();

        for (Post post : allPosts) {
            if (posters.contains(post.getPoster())) {
                selectedPosts.add(post);
            }
        }
        return selectedPosts;
    }
}
