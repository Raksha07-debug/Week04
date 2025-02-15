package multiplecatch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipleCatchTest {
    @Test
    void testValidIndex() {
        int[] arr = {10, 20, 30, 40, 50};
        assertDoesNotThrow(() -> MultipleCatchExample.getValueAtIndex(arr, 2));
    }

    @Test
    void testOutOfBoundsIndex() {
        int[] arr = {10, 20, 30, 40, 50};
        assertDoesNotThrow(() -> MultipleCatchExample.getValueAtIndex(arr, 10));
    }

    @Test
    void testNullArray() {
        int[] arr = null;
        assertDoesNotThrow(() -> MultipleCatchExample.getValueAtIndex(arr, 0));
    }
}
