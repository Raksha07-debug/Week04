package uncheckedexception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UncheckedExceptionTest {
    @Test
    void validDivision(){
        assertEquals(2,UncheckedException.divide(10,5));
        assertEquals(0,UncheckedException.divide(0,3));

    }
    @Test
     void invaliDivision(){

        Exception exception=assertThrows(ArithmeticException.class, ()->{
            UncheckedException.divide(10,0);
        });
        assertEquals("divide by zero is not allowed", exception.getMessage());

    }
}
