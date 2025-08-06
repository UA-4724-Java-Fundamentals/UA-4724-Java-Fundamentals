package com.softserve.academy.final_project;

public class TextStatistics {
    private final int wordCount;
    private final int sentenceCount;
    private final int characterCount;
    private final int syllableCount;
    private final int polysyllableCount;

    public TextStatistics(int wordCount, int sentenceCount, int characterCount, int syllableCount, int polysyllableCount) {
        this.wordCount = wordCount;
        this.sentenceCount = sentenceCount;
        this.characterCount = characterCount;
        this.syllableCount = syllableCount;
        this.polysyllableCount = polysyllableCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getSentenceCount() {
        return sentenceCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getSyllableCount() {
        return syllableCount;
    }

    public int getPolysyllableCount() {
        return polysyllableCount;
    }
}
