package com.balajisengeni.twitterlike.interpreter;

import com.balajisengeni.twitterlike.domain.Post;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 22/12/2013
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
public interface ProcessPost {
    public String evaluatePost(Post post);
}
