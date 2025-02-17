package regex;

import java.util.regex.*;

public class SSNValidator {


    public static boolean isValidSSN(String ssn) {
        if (ssn == null) {
            return false;
        }
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);
        return matcher.find();
    }

    public static void main(String[] args) {
        String validSSN = "My SSN is 123-45-6789.";
        String invalidSSN = "123456789";

        System.out.println(validSSN + " is " + (isValidSSN(validSSN) ? "valid " : "invalid "));
        System.out.println(invalidSSN + " is " + (isValidSSN(invalidSSN) ? "valid " : "invalid "));
    }
}
