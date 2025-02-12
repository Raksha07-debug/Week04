package queueinterface.binaryconversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BinaryConversionTest {

    @Test
    void binaryConversionTest(){
      Set<String> set= new LinkedHashSet<>(List.of("1","10","11","100","101"));
        int n=5;
        Assertions.assertEquals(set,BinaryNumber.generateBinaryNumbers(n));
    }
}
