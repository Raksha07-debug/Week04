package exceptionpropagation;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagtionTest {

    @Test
    void testExceptionPropagation() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {ExceptionPropagation.method1();});

        assertEquals("/ by zero", exception.getMessage());
    }
}