package com.softserve.academy.module01.Homework12.PracticalTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_regular_expr {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-zA-Z_0-9]{3,15}");
        String[] usernames = {
                "Anna",
                "Ro",
                "Artur_1",
                "Invalid-Name%",
                "MaximilianoAndres "
        };
        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            if (matcher.matches()) {
                System.out.println("Name valid: " + username);
            } else {
                System.out.println("Name invalid: " + username);
            }
        }
    }
}
