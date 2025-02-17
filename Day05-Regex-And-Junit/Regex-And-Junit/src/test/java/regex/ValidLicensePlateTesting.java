package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ValidLicensePlateTesting {
    @Test
    void valiTestPlate(){
       assertTrue(ValidLicensePlate.isValidLicensePlate("AB1234"));
        assertTrue(ValidLicensePlate.isValidLicensePlate("XY1254"));
        assertTrue(ValidLicensePlate.isValidLicensePlate("ZZ0000"));

    }
     @Test
    void InvalidTestPlate(){
        assertFalse(ValidLicensePlate.isValidLicensePlate("12345"));
         assertFalse(ValidLicensePlate.isValidLicensePlate("ABCVHJ"));

     }
}
