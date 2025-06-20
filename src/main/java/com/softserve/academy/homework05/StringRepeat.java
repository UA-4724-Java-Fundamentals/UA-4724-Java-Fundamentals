package com.softserve.academy.homework05;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
    }

    static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++)
            result += string;
        return result;
    }
}
