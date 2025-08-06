package com.softserve.academy.final_project;

public class SyllableCounter {
    public int countSyllablesInWord(String word) {
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        if (word.isEmpty()) {
            return 0;
        }

        String vowels = "aeiouy";
        char[] chars = word.toCharArray();

        boolean lastWasVowel = false; // track if last character was a vowel
        int syllables = 0;

        for (char c : chars) {
            boolean isVowel = vowels.indexOf(c) >= 0;

            // If this character is a vowel and the previous wasn't → count syllable
            if (isVowel && !lastWasVowel) {
                syllables++;

            }
            lastWasVowel = isVowel; // update lastWasVowel for next iteration
        }

        // If the word ends with a silent 'e' and has more than 1 syllable → subtract 1
        if (word.endsWith("e") && syllables > 1) {
            syllables--;
        }

        // Guarantee that at least 1 syllable is returned (e.g., for short words like "by")
        return syllables == 0 ? 1: syllables;

    }
}
