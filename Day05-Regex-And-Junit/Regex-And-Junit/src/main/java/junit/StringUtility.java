package junit;
import java.util.*;

public class StringUtility {
    public static String reverse(String text){
        if(text==null) return null;
        return new StringBuilder(text).reverse().toString();
    }
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String text= "she is good is she";
        System.out.println(reverse(text));
        System.out.println(toUpperCase(text));
        System.out.println(isPalindrome(text));

    }
}
