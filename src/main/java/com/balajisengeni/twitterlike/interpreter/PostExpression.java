package com.balajisengeni.twitterlike.interpreter;

import static com.balajisengeni.twitterlike.service.ServiceFacade.getService;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 22/12/2013
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */
public class PostExpression implements Interpreter {
    private String message, posterName;

    public PostExpression(String posterName, String message) {
        this.message = message;
        this.posterName = posterName;
    }

    public StringBuilder interpret() {
        getService().post(message, posterName);
        return null;
    }
}
