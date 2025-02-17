package regex;

public class SpaceReplacer {
    public static String replaceMultipleSpaces(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        String sampleText = "This   is  an   example  with   multiple     spaces.";
        String result = replaceMultipleSpaces(sampleText);

        System.out.println("Modified String: " + result);
    }
}
