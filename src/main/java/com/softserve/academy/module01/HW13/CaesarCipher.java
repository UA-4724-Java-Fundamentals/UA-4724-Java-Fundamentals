package com.softserve.academy.module01.HW13;

public class CaesarCipher {

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base + n) % 26 + base);
                result.append(shifted);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }

    public static void main(String[] args) {
        String text = "abcXYZ";
        int shift = 3;

        String encrypted = encrypt(text, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}

