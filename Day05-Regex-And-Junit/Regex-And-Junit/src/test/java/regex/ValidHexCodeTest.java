package regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidHexCodeTest {
    @Test
    void validHexCode()
    {
        Assertions.assertTrue(ValidHexCode.validHexCode("#ff0012"));
        Assertions.assertTrue(ValidHexCode.validHexCode("#ab1234"));
    }
    @Test

    void invalidHexCode(){
        Assertions.assertFalse(ValidHexCode.validHexCode("#ff2"));
        Assertions.assertFalse(ValidHexCode.validHexCode("#f562"));

    }

}
