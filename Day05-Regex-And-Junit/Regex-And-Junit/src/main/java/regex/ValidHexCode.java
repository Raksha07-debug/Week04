package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexCode {
    public static boolean validHexCode(String hexcode){
        if(hexcode==null){
            return false;
        }
        String regex="^#[0-9A-Fa-f]{6}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(hexcode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testHexCode={"#ff123","#123","#ff0012"};
        for(String hexcode:testHexCode){
            System.out.println(hexcode+" "+(validHexCode(hexcode)?"Valid":"Invalid"));
        }
    }
}
