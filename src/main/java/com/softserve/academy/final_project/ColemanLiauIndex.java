package com.softserve.academy.final_project;

public class ColemanLiauIndex implements ReadabilityScore{

    @Override
    public double calculateScore(TextStatistics stats) {
        double L = (double) stats.getCharacterCount() / stats.getWordCount() * 100;
        double S = (double) stats.getSentenceCount() / stats.getWordCount() * 100;
        return 0.0588 * L - 0.296 * S - 15.8;
    }

    @Override
    public String getName() {
        return "Coleman-Liau index";
    }
}
