package com.softserve.academy.final_project;

public class SMOGIndex implements ReadabilityScore{

    @Override
    public double calculateScore(TextStatistics stats) {
        return 1.043 * Math.sqrt(stats.getPolysyllableCount() * (30.0 / stats.getSentenceCount()))
                + 3.1291;
    }

    @Override
    public String getName() {
        return "Simple Measure of Gobbledygook";
    }
}
