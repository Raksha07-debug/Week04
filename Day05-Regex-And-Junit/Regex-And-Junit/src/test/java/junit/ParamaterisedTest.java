package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParamaterisedTest {

    @Test
    void isEven(){
        int number=4;
        Assertions.assertEquals(true,Paramaterised.isEven(number));
    }
    @Test
    void notEven()
    {
        int number=5;
        Assertions.assertEquals(false,Paramaterised.isEven(number));
    }
}
