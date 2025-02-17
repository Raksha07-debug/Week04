package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraxtAll {
    public  static List<String > extractCapital(String text){
        List<String > words= new ArrayList<>();
        if(text== null){
            return words;
        }
        String regex= "\\b[A-Z][a-z]+\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            words.add(matcher.group());
        }
        return words;

    }


    public static void main(String[] args) {
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words= extractCapital(text);
        for(String word:words){
            System.out.println("output is "+words);
        }
    }
}
