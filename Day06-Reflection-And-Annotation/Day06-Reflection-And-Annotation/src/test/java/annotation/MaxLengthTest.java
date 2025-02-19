package annotation;

import annotation.maxlength.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxLengthTest {
    // Test for valid username length
    @Test
    public void testValidUsername() {
        User user = new User("JohnDoe");
        assertEquals("JohnDoe", user.getUsername());
    }

    // Test for username exceeding maximum length
    @Test
    public void testUsernameExceedsMaxLength() {
        // This username exceeds the maximum length of 10
        assertThrows(IllegalArgumentException.class, () -> {
            new User("JohnDoe12345");
        });
    }

    // Test for username at maximum length
    @Test
    public void testUsernameAtMaxLength() {
        User user = new User("JohnDoe10");
        assertEquals("JohnDoe10", user.getUsername());
    }
}
