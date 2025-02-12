package symmetricdifference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

public class SymmetricDifferenceTest {

    // Creating HashSet with elements 1, 2, and 3
    HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3));

    // Creating HashSet with elements 3, 4, and 5
    HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

    @Test
    void symmetricDifference() {
        // Creating expected output HashSet with elements 1, 2, 4, and 5
        HashSet<Integer> output = new HashSet<>(List.of(1, 2, 4, 5));

        // Checking if the symmetric difference between set1 and set2 equals the expected output
        Assertions.assertEquals(output, SymmetricDifference.symmetricDifference(set1, set2));
    }
}
