package regex;

import java.util.regex.Pattern;

public class ValidateIpAddress {
    public static boolean isValidIPAddress(String ip) {
        if (ip == null) {
            return false;
        }
        String IPV4_REGEX = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(IPV4_REGEX);
        return pattern.matcher(ip).matches();
    }

    public static void main(String[] args) {
        String[] testIPs = {"192.168.1.1", "255.255.255.255", "0.0.0.0", "256.100.50.25", "192.168.1", "192.168.1.300", "abc.def.gha.bcd"};

        for (String ip : testIPs) {
            System.out.println(ip + " is valid? " + isValidIPAddress(ip));
        }
    }
}
