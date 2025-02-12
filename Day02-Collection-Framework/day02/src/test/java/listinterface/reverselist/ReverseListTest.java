package listinterface.reverselist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseListTest {

    // Test method to reverse lists and verify the results
    @Test
    void reverseList() {
        // Create a LinkedList with initial values
        List<Integer> list = new LinkedList<>(List.of(10, 20, 30, 40));

        // Create an ArrayList with initial values
        List<Integer> arrList = new ArrayList<>(List.of(70, 50, 90, 30));

        // Create expected reversed results for LinkedList and ArrayList
        List<Integer> resultList = new LinkedList<>(List.of(40, 30, 20, 10));
        List<Integer> resultarrList = new ArrayList<>(List.of(30, 90, 50, 70));

        // Call the reverseList method on both lists
        Reverse.reverseList(list);
        Reverse.reverseList(arrList);

        // Assert the actual results against the expected results
        Assertions.assertEquals(resultList, list);
        Assertions.assertEquals(resultarrList, arrList);
    }
}
