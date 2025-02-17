package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLicensePlate {
    public static boolean isValidLicensePlate(String licenseNumber)
    {
        if (licenseNumber == null) {
            return false;
        }
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(licenseNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testPlate = {"AB1234", "A12345", "XY6789", "ab124", "ZZ0000"};
        for (String plate : testPlate) {
            System.out.println(plate + " " + (isValidLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
