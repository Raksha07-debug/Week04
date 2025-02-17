package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {
    @Test
    void checkPallindrom(){
        String str="level";
        Assertions.assertEquals(true,StringUtility.isPalindrome(str));
    }
    @Test
    void checkReverse(){
        String text="raksha";
        String expected="ahskar";
        Assertions.assertEquals(expected,StringUtility.reverse(text));
    }
    @Test
    void checkUpperCase(){
        String text="raksha";
        String expected="RAKSHA";
        Assertions.assertEquals(expected,StringUtility.toUpperCase(text));
    }

}
