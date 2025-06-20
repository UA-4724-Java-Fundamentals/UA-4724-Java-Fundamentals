package com.softserve.academy.homework05;

import java.util.Arrays;

public class WrongEndHead {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fixTheMeerkat(new String[]{"head", "body", "tail"})));
    }

    static String[] fixTheMeerkat(String[] arr) {
        return new String[]{arr[2], arr[1], arr[0]};
    }
}
