package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainNameExtractor {
    public static List<String> extractDomain(String text) {
        List<String> words = new ArrayList<>();
        if (text == null) {
            return words;
        }
        String regex = "\\bhttps?://[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}\\b*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> words = extractDomain(text);
        for (String word : words) {
            System.out.println("Extracted domain: " + word);
        }
    }
}
