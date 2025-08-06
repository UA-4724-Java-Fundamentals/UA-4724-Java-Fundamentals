package com.softserve.academy.final_project;

public class FleschKincaidScore implements ReadabilityScore{

    @Override
    public double calculateScore(TextStatistics stats) {
        return 0.39 * ((double) stats.getWordCount() / stats.getSentenceCount())
                + 11.8 * ((double) stats.getSyllableCount() / stats.getWordCount())
                - 15.59;
    }

    @Override
    public String getName() {
        return "Flesch-Kincaid readability tests";
    }
}
