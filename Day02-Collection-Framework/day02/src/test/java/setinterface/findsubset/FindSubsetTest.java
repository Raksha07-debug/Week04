package setinterface.findsubset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class FindSubsetTest {
//Testing of subset 
    @Test
    void findsubsetTest(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(true,FindSubset.isSubSet(set1,set2));
    }
}
