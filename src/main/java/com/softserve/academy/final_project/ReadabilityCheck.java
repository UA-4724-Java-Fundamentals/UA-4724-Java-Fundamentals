package com.softserve.academy.final_project;

public class ReadabilityCheck {
    private final String text;
    private final SyllableCounter syllableCounter;

    public ReadabilityCheck(String text, SyllableCounter syllableCounter) {
        this.text = text;
        this.syllableCounter = syllableCounter;
    }

    public String getText() {
        return text;
    }

    public SyllableCounter getSyllableCounter() {
        return syllableCounter;
    }

    // Method to run all analyses and return the results
    public TextStatistics analyzeText() {
        int wordCount = countWords();
        int sentenceCount = countSentences();
        int characterCount = countCharacters();
        int syllableCount = countSyllables();
        int polysyllableCount = countPolysyllables();

        return new TextStatistics(wordCount, sentenceCount, characterCount, syllableCount, polysyllableCount);

    }

    // Count all words by removing punctuation and splitting by whitespace
    private int countWords() {
        String cleanedText = text.replaceAll("[^a-zA-Z\\s]", "");
        String[] words = cleanedText.split("\\s+");
        return words.length;
    }

    // Count all sentences by splitting text by sentence-ending punctuation
    private int countSentences() {
        String[] sentences = text.split("[.!?]+");
        int totalSentences = 0;
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                totalSentences++;
            }
        }

        return totalSentences;

    }

    // Count all characters except spaces and line breaks
    private int countCharacters() {
        String charsOnly = text.replaceAll("\\s+", "");
        int characters = charsOnly.length();
        return characters;
    }

    // Count total syllables using SyllableCounter class
    private int countSyllables() {
        String[] words = text.toLowerCase().split("\\s+");
        int totalSyllables = 0;
        for (String word : words) {
            totalSyllables += syllableCounter.countSyllablesInWord(word);
        }
        return totalSyllables;
    }
    // Count number of words that have more than 2 syllables
    private int countPolysyllables() {
        String[] words = text.toLowerCase().split("\\s+");
        int totalPolysyllables = 0;
        for (String word : words) {
            if ((syllableCounter.countSyllablesInWord(word)) > 2) {
                totalPolysyllables++;
            }
        }

        return totalPolysyllables;
    }


}
