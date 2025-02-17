package regex;

import java.util.regex.Pattern;

public class CardValidator {

    public static String validateCreditCard(String cardNumber) {
        String visaRegex = "^4\\d{15}$";
        String mastercardRegex = "^5\\d{15}$";
        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterCardPattern = Pattern.compile(mastercardRegex);

        if (visaPattern.matcher(cardNumber).matches()) {
            return "Valid Visa Card";
        } else if (masterCardPattern.matcher(cardNumber).matches()) {
            return "Valid MasterCard";
        } else {
            return "Invalid Card Number";
        }
    }

    public static void main(String[] args) {
        String[] testCards = {
                "4111111111111111", "5105105105105100", "6011000990139424", "4222222222222", "5000000000000000", "abcd567890123456"};

        for (String card : testCards) {
            System.out.println(card + " - " + validateCreditCard(card));
        }
    }
}
