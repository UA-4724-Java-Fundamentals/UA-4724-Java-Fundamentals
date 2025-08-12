import java.util.*;
import java.util.regex.*;

public class HomeworkStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1: enter a sentence of exactly 5 words:");
        String line1 = sc.nextLine().trim();
        String[] words = line1.replaceAll("\\s+", " ").split(" ");
        if (words.length != 5) {
            System.out.println("Warning: expected 5 words, got " + words.length + ". I will proceed with what you entered.");
        }
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest word: " + longest);
        System.out.println("Letters in longest: " + longest.length());
        if (words.length >= 2) {
            String secondReversed = new StringBuilder(words[1]).reverse().toString();
            System.out.println("Second word reversed: " + secondReversed);
        } else {
            System.out.println("Second word reversed: (no second word)");
        }

        System.out.println("\nTask 2: enter a sentence with multiple spaces between words:");
        String line2 = sc.nextLine();
        String normalized = line2.replaceAll("\\s+", " ").trim();
        System.out.println("Normalized: " + normalized);

        System.out.println("\nTask 3: enter a text that contains US currency amounts like $12.34:");
        String line3 = sc.nextLine();
        Pattern money = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = money.matcher(line3);
        List<String> matches = new ArrayList<>();
        while (m.find()) matches.add(m.group());
        if (matches.isEmpty()) {
            System.out.println("No US currency amounts found.");
        } else {
            System.out.println("Found amounts: " + String.join(", ", matches));
        }
    }
}
