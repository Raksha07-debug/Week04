package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtract {
    public static List<String> extractDate(String text){
        List<String> words = new ArrayList<>();
        if(text == null) {
            return words;
        }
        // Corrected regular expression
        String regex = "\\b(\\d{2}/\\d{2}/\\d{4}|\\d{2}\\.\\d{2}\\.\\d{4}|\\d{2}-\\d{2}-\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15-08-2024, and 29.02.2020.";
        List<String> words = extractDate(text);
        for (String word : words) {
            System.out.println("Dates are: " + word);
        }
    }
}
