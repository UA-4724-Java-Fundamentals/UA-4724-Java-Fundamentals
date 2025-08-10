package module13.homework;

public class Homework1 {public static String encrypt(String s, int n) {
    StringBuilder result = new StringBuilder();
    for (char ch : s.toCharArray()) {
        if (Character.isLetter(ch)) {
            char base = Character.isLowerCase(ch) ? 'a' : 'A';
            char encryptedChar = (char) (base + (ch - base + n) % 26);
            result.append(encryptedChar);
        } else {
            result.append(ch);
        }
    }
    return result.toString();
}

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }

    public static void main(String[] args) {
        System.out.println("--- Завдання 1: Шифрування ---");
        String originalText = "Hello World!";
        int shift = 3;
        String encryptedText = encrypt(originalText, shift);
        String decryptedText = decrypt(encryptedText, shift);

        System.out.println("Оригінал: " + originalText);
        System.out.println("Зашифровано: " + encryptedText);
        System.out.println("Розшифровано: " + decryptedText);
    }
}
