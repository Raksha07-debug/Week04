package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static boolean isValidUsername(String username)
    {
        if(username==null){
            return false;
        }
        String regex="^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(username);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] randomUser={"user_123","123users","123user","us","Valid_User","valid123"};
        for(String username:randomUser){
            System.out.println(username+ " "+(isValidUsername(username)?"Valid":"Invalid"));
        }
    }
}
