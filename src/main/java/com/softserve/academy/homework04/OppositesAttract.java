package com.softserve.academy.homework04;

public class OppositesAttract {

    public static void main(String[] args) {
        System.out.println(isLove(1, 4));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 + flower2) % 2 != 0;
    }
}
