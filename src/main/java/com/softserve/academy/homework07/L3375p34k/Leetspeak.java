package com.softserve.academy.homework07.L3375p34k;

public class Leetspeak extends Encoder {

    public String encode(String source) {
        String result = "";

        if (source == null || source.isEmpty()) {
            return result;
        }

        for (char c : source.toCharArray()) {
            result += replaceChar(c);
        }

        return result;
    }

    private String replaceChar(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'a' -> "4";
            case 'e' -> "3";
            case 'l' -> "1";
            case 'm' -> "/^^\\";
            case 'o' -> "0";
            case 'u' -> "(_)";
            default -> String.valueOf(c);
        };
    }
}
