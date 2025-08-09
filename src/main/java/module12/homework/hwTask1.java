package module12.homework;
import java.util.Scanner;
public class hwTask1 {

    public class SentenceAnalyzer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a sentence (e.g., five words):");
            String sentence = scanner.nextLine();
            // Split the sentence into an array of words
            String[] words = sentence.split("\\s+");
            if (words.length > 0) {
                // Find the longest word
                String longestWord = "";
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
                System.out.println("The longest word is: " + longestWord);
                System.out.println("Length of the longest word is: " + longestWord.length());
                // Reverse the second word
                if (words.length >= 2) {
                    String secondWord = words[1];
                    String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();
                    System.out.println("The second word in reverse is: " + reversedSecondWord);
                } else {
                    System.out.println("The sentence has fewer than two words.");
                }
            } else {
                System.out.println("No words were entered.");
            }

            scanner.close();
        }
    }

}

