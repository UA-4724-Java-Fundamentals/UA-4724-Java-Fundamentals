package com.softserve.academy.homework_13;

public class EncryptDecrypt {
    @FunctionalInterface
    interface CharTransformer {
        char transform(char c);
    }


    // Encrypts the string using a lambda expression for shifting characters forward
    public static String encrypt(String s, int n) {
        return transformString(s, c -> shiftChar(c, n));
    }

    // Decrypts the string using a lambda expression for shifting characters backward
    public static String decrypt(String s, int n) {
        return transformString(s, c -> shiftChar(c, -n));
    }


    // Shifts characters by n positions, wrapping around the alphabet
    public static char shiftChar(char c, int n) {
        if (Character.isLowerCase(c)) {
            return (char) ((c - 'a' + n + 26) % 26 + 'a');
        } else if (Character.isUpperCase(c)) {
            return (char) ((c - 'A' + n + 26) % 26 + 'A');
        } else {
            return c; // Non-letter characters remain unchanged
        }
    }

    // Applies a character transformation to each character in the input string
    public static String transformString(String input, CharTransformer transformer) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char transformedChar = transformer.transform(c);
            result.append(transformedChar);
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String original = "COLD";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }


}
