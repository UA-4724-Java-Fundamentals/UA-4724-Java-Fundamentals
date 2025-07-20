package com.softserve.academy.practical12;

import java.util.List;
import java.util.regex.Pattern;

public class UsernameValidator {

    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_]{3,15}$");

    private enum ValidationStatus {
        VALID("✅ Valid"),
        INVALID("❌ Invalid");

        private final String label;

        ValidationStatus(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    private record ValidationResult(String username, ValidationStatus status) {
        @Override
        public String toString() {
            return "Username: %-30s => %s".formatted(username, status.getLabel());
        }
    }

    private static ValidationResult validate(String username) {
        boolean matches = USERNAME_PATTERN.matcher(username).matches();
        return new ValidationResult(username, matches ? ValidationStatus.VALID : ValidationStatus.INVALID);
    }

    public static void main(String[] args) {
        List<String> usernames = List.of(
                "jon_snow",
                "a1",
                "Valid_123",
                "TooLongUsernameHere123",
                "invalid#name"
        );

        usernames.stream()
                .map(UsernameValidator::validate)
                .forEach(System.out::println);
    }
}

