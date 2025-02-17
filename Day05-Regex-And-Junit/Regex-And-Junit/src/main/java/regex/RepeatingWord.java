package regex;
import java.util.*;
import java.util.regex.*;

public class RepeatingWord {
    //method to find repeating words
    public static Set<String> findRepeatingWords(String text) {
        Set<String> words = new HashSet<>();
        Set<String> repeatingWords = new HashSet<>();

        if (text == null || text.isEmpty()) {
            return repeatingWords;
        }

        String regex = "\\b(\\w+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group(1).toLowerCase();
            if (!words.add(word)) {
                repeatingWords.add(word);
            }
        }

        return repeatingWords;
    }

    public static void main(String[] args) {
        String sampleText = "This is is a repeated repeated word test.";
        Set<String> repeatingWords = findRepeatingWords(sampleText);

        System.out.println("Repeating Words:" + repeatingWords);
    }
}
