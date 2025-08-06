package com.softserve.academy.final_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadabilityApp {
    public static void main(String[] args) {
        // Check if at least one file is provided as argument
        if (args.length == 0) {
            System.out.println("File is not found. Add file");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        // Loop through each file provided in arguments
        for (String fileName : args) {
            StringBuilder textBuilder = new StringBuilder();
            try {
                // Read file line by line
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    textBuilder.append(line).append(" ");

                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
            // Get full text from file
            String text = textBuilder.toString().trim();
            System.out.println("-".repeat(40));
            System.out.println("The text is:\n" + text);

            // Create syllable counter and readability checker objects
            SyllableCounter syllableCounter = new SyllableCounter();
            ReadabilityCheck readabilityCheck = new ReadabilityCheck(text, syllableCounter);

            // Analyze text statistics
            TextStatistics stats = readabilityCheck.analyzeText();

            // Print basic statistics
            System.out.println("-".repeat(40));
            System.out.println("Words: " + stats.getWordCount());
            System.out.println("Sentences: " + stats.getSentenceCount());
            System.out.println("Characters: " + stats.getCharacterCount());
            System.out.println("Syllables: " + stats.getSyllableCount());
            System.out.println("Polysyllables: " + stats.getPolysyllableCount());
            System.out.println("-".repeat(40));

            // Ask user which readability score to calculate
            System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all):");
            String choice = scanner.nextLine().trim().toUpperCase();

            // If user wants all scores
            if ("ALL".equals(choice)) {
                ReadabilityScore[] scores = {
                        new AutomatedReadabilityIndex(),
                        new FleschKincaidScore(),
                        new SMOGIndex(),
                        new ColemanLiauIndex()
                };
                double totalAge = 0;
                int count = 0;

                // Calculate and print each score with corresponding age
                for(ReadabilityScore s: scores){
                    double scoreValue = s.calculateScore(stats);
                    int age = AgeConverter.convertScoreToAge(scoreValue);
                    totalAge+=age;
                    count++;

                    System.out.printf("%s: %.2f (about %d-year-olds). \n",s.getName(), s.calculateScore(stats), age);
                }
                double averageAge = totalAge/count;
                System.out.printf("\nThis text should be understood in average by %.2f-year-olds.\n", averageAge);
            } else {
                // Calculate selected score only
                ReadabilityScore score = switch (choice) {
                    case "ARI" -> new AutomatedReadabilityIndex();
                    case "FK" -> new FleschKincaidScore();
                    case "SMOG" -> new SMOGIndex();
                    case "CL" -> new ColemanLiauIndex();
                    default -> null;
                };

                // Print score or error message
                if (score != null) {
                    System.out.printf("%s: %.2f\n", score.getName(), score.calculateScore(stats));
                } else {
                    System.out.println("Invalid input.");
                }
            }

        }
        scanner.close();
    }

}