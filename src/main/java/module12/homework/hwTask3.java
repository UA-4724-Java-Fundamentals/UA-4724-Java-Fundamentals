package module12.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hwTask3 {


    public class CurrencyFinder {
        public static void main(String[] args) {
            String text = "The price of the book is $29.99. A coffee costs $4.50, but a special offer is $3.99! Not to be confused with 123.45 or $100.";

            // Regex: \$ (literal dollar) followed by \d+ (one or more digits),
            // a literal \. (dot), and \d{2} (exactly two digits).
            String currencyRegex = "\\$\\d+\\.\\d{2}";

            Pattern pattern = Pattern.compile(currencyRegex);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Found currency values in the text:");
            // Loop through all matches
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
