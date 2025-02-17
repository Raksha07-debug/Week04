package regex;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CensorBadWords {
    public static String censorText(String text, List<String> badWords) {
        if (text == null || badWords.isEmpty()) {
            return text;
        }

        for (String word : badWords) {
            String regex = "\\b" + word + "\\b";
            text = text.replaceAll(regex, "****");
        }
        return text;
    }

    public static void main(String[] args) {
        String sampleText = "This is a damn bad example with some stupid words.";
        List<String> badWords = List.of("damn", "stupid");

        String censoredText = censorText(sampleText, badWords);
        System.out.println("Censored Text: " + censoredText);
    }
}
