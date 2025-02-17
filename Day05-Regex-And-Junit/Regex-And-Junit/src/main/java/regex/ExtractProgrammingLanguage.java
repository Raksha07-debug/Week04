package regex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    public static List<String> extractLanguage(String text){
        List<String> language= new ArrayList<>();
        if(text==null){
            return language;
        }
        String regex = "\\b(JavaScript|Java|Python|Go|Swift|Ruby|Kotlin|PHP|TypeScript|Rust|Perl|R|Scala)\\b|(?<=\\s|^)(C\\+\\+|C)(?=\\s|$)";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        while (matcher.find())
        {
            language.add(matcher.group());
        }
        return language;
    }

    public static void main(String[] args) {
        String text= "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String > language= extractLanguage(text);
        for(String languag:language){
            System.out.println("programming language are: "+languag);
        }
    }
}
