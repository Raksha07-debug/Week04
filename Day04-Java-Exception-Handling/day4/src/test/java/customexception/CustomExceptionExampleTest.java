package customexception;

import customexception.InvalidAgeException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomExceptionExampleTest {

    @Test
    void testValidAge() {
        assertDoesNotThrow(() -> CustomException.validateAge(18));
        assertDoesNotThrow(() -> CustomException.validateAge(25));
    }

    @Test
    void testInvalidAge() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            CustomException.validateAge(16);
        });
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}