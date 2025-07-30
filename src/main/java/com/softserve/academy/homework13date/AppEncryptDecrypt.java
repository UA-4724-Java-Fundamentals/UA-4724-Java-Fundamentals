package com.softserve.academy.homework13date;

public class AppEncryptDecrypt {
    public static void main(String[] args) {
        String input = "abc";
        int shift = 3;

        String encrypted = encrypt(input, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Original:   " + input);
        System.out.println("Encrypted:  " + encrypted);
        System.out.println("Decrypted:  " + decrypted);
    }

    public static String encrypt(String s, int n) {
        return shiftString(s, n);
    }

    public static String decrypt(String s, int n) {
        return shiftString(s, -n);
    }

    private static String shiftString(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base + n + 26) % 26 + base);
                result.append(shifted);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

}
