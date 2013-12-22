package com.balajisengeni.twitterlike.domain;

import org.joda.time.LocalDateTime;
import static com.balajisengeni.twitterlike.util.PostPrintHelper.getElapsedTime;
/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
public class Post {
    private final String message;
    private final User poster;
    private final LocalDateTime createDate;

    public Post(String message, User poster) {
        this.message = message;
        this.poster = poster;
        this.createDate = new LocalDateTime();
    }

    public User getPoster() {
        return poster;
    }

    @Override
    public String toString() {
        return message + " ("+ getElapsedTime(createDate)+" ago)";
    }
}
