package com.softserve.academy.final_project;

import java.util.Random;
import java.util.stream.Collectors;

public class CardGenerator {
    private static final String BIN = "400000";
    private static final Random random = new Random();

    public static String generateCardNumber() {
        String randomNineNumbers = random.ints(9, 0, 10)
                .mapToObj(String::valueOf).collect(Collectors.joining());
        String numberWithoutChecksum = BIN + randomNineNumbers;

        int checksum = generateChecksum(numberWithoutChecksum);

        return numberWithoutChecksum + checksum;
    }

    public static String generatePin() {
        int pin = random.nextInt(10000);
        return String.format("%04d", pin);
    }

    public static int generateChecksum(String numberWithoutChecksum) {
        int sum = 0;

        for (int i = 0; i < numberWithoutChecksum.length(); i++) {
            int digit = Character.getNumericValue(numberWithoutChecksum.charAt(i));
            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }

        return (10 - (sum % 10)) % 10;
    }
}
