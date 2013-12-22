package com.balajisengeni.twitterlike;

import com.balajisengeni.twitterlike.interpreter.Evaluator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class TwitterLike {
    public static void main( String[] args ) {
        String readLine;
        System.out.println("Welcome to TwitterLike.\n> ");
        Scanner in = new Scanner(System.in);
        readLine = in.nextLine();
        StringBuilder output;

        while (readLine != "quit") {
            output = new Evaluator(readLine).interpret();
            if (output != null) {
                System.out.println( output );
            }
            System.out.print( "> ");
            readLine = in.nextLine();
        }

        in.close();
    }
}
