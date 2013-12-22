package com.balajisengeni.twitterlike.service;

import static com.balajisengeni.twitterlike.repository.UserRepository.getUserRepository;
/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
public class FollowService {
    private static FollowService instance = new FollowService();

    private FollowService() { }

    public static FollowService getInstance() {
        return instance;
    }

    public void execute(String followerName, String followeeName) {
        getUserRepository().getUserByName(followerName).follow(
                getUserRepository().getUserByName(followeeName));
    }
}
