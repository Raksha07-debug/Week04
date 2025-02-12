package setinterface.checkiftwoareequal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

public class CheckEqualSetTest {
    // Test method to verify if two sets are equal
    @Test
    void equalSetTest() {
        // Create the first HashSet with elements 1, 2, 3
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3));

        // Create the second HashSet with elements 3, 2, 1
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 2, 1));

        // Assert that the two sets are equal using the isEqual method
        Assertions.assertEquals(true, CheckEqualSet.isEqual(set1, set2));
    }
}
