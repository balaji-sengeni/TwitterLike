package com.balajisengeni.twitterlike.interpreter;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:27
 * To change this template use File | Settings | File Templates.
 */
//interpreter pattern
public class Evaluator {
    private Interpreter syntaxTree;

    public Evaluator(String command) {
        Scanner commandTokens = new Scanner(command).useDelimiter(" ");
        String subject = commandTokens.next();

        if (!commandTokens.hasNext()) {
            syntaxTree = new ReadExpression(subject);
        } else {
            String action = commandTokens.next();
            if (!commandTokens.hasNext()) {
                syntaxTree = new WallExpression(subject);
            } else {
                String object = commandTokens.skip(" ").nextLine();
                if ("->".equalsIgnoreCase(action)) {
                    syntaxTree = new PostExpression(subject, object);
                } else {
                    syntaxTree = new FollowExpression(subject, object);
                }
            }
        }
    }

    public StringBuilder interpret() {
        return syntaxTree.interpret();
    }
}
