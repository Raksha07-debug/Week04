package listinterface.roateelementinarray;

import listinterface.rotateelementinarray.RotateElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RotateElementTest {
    // Test method to verify the rotation functionality
    @Test
    void rotateTest() {
        // Create a list with the elements to be rotated
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        // Expected result after rotation by 2 positions
        List<Integer> result = new ArrayList<>(List.of(30, 40, 50, 10, 20));

        // Assert that the result of rotateArr matches the expected result
        Assertions.assertEquals(result, RotateElement.rotateArr(list, 2));
    }
}
