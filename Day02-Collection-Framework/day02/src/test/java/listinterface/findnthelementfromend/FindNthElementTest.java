package listinterface.findnthelementfromend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class FindNthElementTest {
    // Test method to verify the functionality of finding the Nth element from the end
    @Test
    void findElementTest() {
        // Create a LinkedList with elements ["A", "B", "C", "D", "E"]
        List<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        // Number of positions from the end
        int n = 2;

        // Assert that the result of finding the Nth element from the end is "D".
        Assertions.assertEquals("D", FindNthElement.result(list, n));
    }
}
