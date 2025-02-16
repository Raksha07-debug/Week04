package finalblock;

import finallyblockexecution.FinallyBlock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinalBlockTest{

    @Test
    void testValidDivision() {
        assertEquals(5, FinallyBlock.divideNumbers(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertEquals(0, FinallyBlock.divideNumbers(10, 0));
    }
}
