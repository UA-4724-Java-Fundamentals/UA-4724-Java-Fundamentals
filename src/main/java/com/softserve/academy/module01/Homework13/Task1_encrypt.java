package com.softserve.academy.module01.Homework13;

public class Task1_encrypt {

    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
                encrypted.append((char) (ch + n));
            } else {
                encrypted.append(' ');
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    public static void main(String[] args) {
        String s = "Hello";
        int n = 3;
        System.out.println(encrypt(s, n));
        System.out.println(decrypt(encrypt(s, n), n));

    }
}
