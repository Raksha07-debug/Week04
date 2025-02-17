package junit;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationTest {
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        ListOperation.addElemement(list, 5);
        ListOperation.addElemement(list, 10);
        assertEquals(2, list.size());
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        list.add(5);
        list.add(10);
        ListOperation.removeElement(list, 5);
        assertEquals(1, list.size());
        assertFalse(list.contains(5));
    }

    @Test
    void testRemoveElement_NotInList() {
        list.add(5);
        ListOperation.removeElement(list, 10);
        assertEquals(1, list.size());
    }

    @Test
    void testGetSize() {
        assertEquals(0, ListOperation.size(list));
        list.add(5);
        assertEquals(1, ListOperation.size(list));
        list.add(10);
        assertEquals(2, ListOperation.size(list));
    }
}
