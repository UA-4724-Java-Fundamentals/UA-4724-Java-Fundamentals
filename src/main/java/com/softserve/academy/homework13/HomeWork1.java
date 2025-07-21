package com.softserve.academy.homework13;

public class HomeWork1 {
    public static void main(String[] args) {
        String string = "abc";
        int step = 3;

        String encrypt = transformString(string, ch -> (char) (ch + step));
        String decrypt = transformString(encrypt, ch -> (char) (ch - step));

        System.out.println(encrypt);
        System.out.println(decrypt);
    }

    private static String transformString(String s, CharTransformer transformer) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            result.append(transformer.transform(ch));
        }
        return result.toString();
    }
}

@FunctionalInterface
interface CharTransformer {
    char transform(char ch);
}