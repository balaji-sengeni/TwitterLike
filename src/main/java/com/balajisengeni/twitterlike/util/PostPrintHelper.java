package com.balajisengeni.twitterlike.util;

import com.balajisengeni.twitterlike.domain.Post;
import com.balajisengeni.twitterlike.interpreter.ProcessPost;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatterBuilder;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 21/12/2013
 * Time: 22:04
 * To change this template use File | Settings | File Templates.
 */
public class PostPrintHelper {

    public static StringBuilder getStringBuilder(List<Post> posts, ProcessPost processPost) {
        StringBuilder sb = new StringBuilder('\n');
        for (Post post : posts) {
           sb.append(processPost.evaluatePost(post) + "\n");
        }
        return sb;
    }

    public static String getElapsedTime(LocalDateTime initialDate)  {
        Period elapsedPeriod = new Period(initialDate, new LocalDateTime());
        PeriodFormatterBuilder formatterBuilder = new PeriodFormatterBuilder();
        if (elapsedPeriod.getYears() > 0) {
            formatterBuilder.appendYears().appendSuffix(" year", " years");
        } else if (elapsedPeriod.getMonths() > 0) {
            formatterBuilder.appendMonths().appendSuffix(" month", " months");
        } else if (elapsedPeriod.getWeeks() > 0) {
            formatterBuilder.appendWeeks().appendSuffix(" week", " weeks");
        } else if (elapsedPeriod.getDays() > 0) {
            formatterBuilder.appendDays().appendSuffix(" day", " days");
        } else if (elapsedPeriod.getHours() > 0) {
            formatterBuilder.appendHours().appendSuffix(" hour", " hours");
        } else if (elapsedPeriod.getMinutes() > 0) {
            formatterBuilder.appendMinutes().appendSuffix(" minute", " minutes");
        } else {
            formatterBuilder.appendSeconds().appendSuffix(" second", " seconds");
        }
        return formatterBuilder.toFormatter().print(elapsedPeriod);
    }

}
