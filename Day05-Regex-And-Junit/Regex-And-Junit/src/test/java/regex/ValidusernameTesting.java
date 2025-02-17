package regex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidusernameTesting {
    @Test
    public void testValidUsernames() {
        assertTrue(ValidateUserName.isValidUsername("user_123"));
        assertTrue(ValidateUserName.isValidUsername("Valid_User"));
        assertTrue(ValidateUserName.isValidUsername("valid12345"));
    }

    @Test
    public void testInvalidUsernames() {
        assertFalse(ValidateUserName.isValidUsername("123user"));
        assertFalse(ValidateUserName.isValidUsername("us"));
        assertFalse(ValidateUserName.isValidUsername("veryverylongusername"));
        assertFalse(ValidateUserName.isValidUsername("user@name"));
        assertFalse(ValidateUserName.isValidUsername(""));
        assertFalse(ValidateUserName.isValidUsername(null));
    }
}
