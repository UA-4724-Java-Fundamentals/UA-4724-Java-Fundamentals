package module12.homework;
import java.util.Scanner;

public class hwTask2 {

    public class SpaceNormalizer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence with extra spaces between words:");
            String sentence = scanner.nextLine();

            // The regex "\\s+" matches one or more whitespace characters
            String normalizedSentence = sentence.trim().replaceAll("\\s+", " ");

            System.out.println("Normalized sentence: \"" + normalizedSentence + "\"");

            scanner.close();
        }
    }
}
