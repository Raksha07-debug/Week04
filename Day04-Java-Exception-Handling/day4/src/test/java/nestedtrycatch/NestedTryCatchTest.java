package nestedtrycatch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NestedTryCatchTest{
    private int divideArrayElement(int[] arr, int index, int divisor) {
        return arr[index] / divisor;
    }
    @Test
    void testValidCase() {
        assertEquals(5, divideArrayElement(new int[]{10, 20, 30, 40}, 0, 2));
    }

    @Test
    void testInvalidIndex() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            divideArrayElement(new int[]{10, 20, 30}, 5, 2);
        });
        assertNotNull(exception);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            divideArrayElement(new int[]{10, 20, 30}, 1, 0);
        });
        assertNotNull(exception);
    }


}