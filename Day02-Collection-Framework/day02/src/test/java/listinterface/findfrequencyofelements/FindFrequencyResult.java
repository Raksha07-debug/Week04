package listinterface.findfrequencyofelements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindFrequencyResult {

    // Test method to check the frequency count of elements in a list
    @Test
    void frequencyTest() {
        // Create an ArrayList with initial values
        List<String> list = new ArrayList<>(List.of("apple", "banana", "apple", "orange"));

        // Create a map with expected frequency counts
        Map<String, Integer> map = Map.of("apple", 2, "banana", 1, "orange", 1);

        // Call the countFrequencies method to get the actual frequency counts
        Map<String, Integer> frequency = FindFrequency.countFrequencies(list);

        // Assert the actual results against the expected results
        Assertions.assertEquals(map, frequency);
    }
}
