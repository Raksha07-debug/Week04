package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static List<String> extractEmail(String text)
    {
        List<String> email= new ArrayList<>();
        if(text==null){
            return email;
        }
        String regex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
       while(matcher.find()){
           email.add(matcher.group());
       }
       return email;
    }

    public static void main(String[] args) {
        String text=" contact us on rak07@gmail.com for any queries email to 1307sd@edu.org";
        List<String> emails=extractEmail(text);
        for(String email :emails){
            System.out.println("extracted emails" + emails);
        }

    }

}
