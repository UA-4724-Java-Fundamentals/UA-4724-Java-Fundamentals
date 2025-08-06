package com.softserve.academy.final_project;

public class AutomatedReadabilityIndex implements ReadabilityScore{
    @Override
    public double calculateScore(TextStatistics stats){
        return 4.71 * ((double) stats.getCharacterCount() / stats.getWordCount())
                + 0.5 * ((double) stats.getWordCount() / stats.getSentenceCount())
                - 21.43;
    }
    @Override
    public String getName() {
        return "Automated Readability Index";
    }
}
