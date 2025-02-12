package listinterface.converttoasortedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import setinterface.converttoasortedlist.ConvertSortedList;

import java.util.*;

public class ConvertToSortedListTest {
    @Test
    void testSetToSortedList() {
        // Initialize a HashSet with elements
        HashSet<Integer> set = new HashSet<>(List.of(5, 3, 9, 1));

        // Expected result after sorting
        List<Integer> expected = List.of(1, 3, 5, 9);

        // Actual result from the setToSortedList method
        List<Integer> actual = ConvertSortedList.sorted(set);
        // Assert that the expected result matches the actual result
        Assertions.assertEquals(expected, actual);
    }
}
