package queueinterface.circularbufferqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import queueinterface.circularbufferqueue.CircularBufferQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CircularBufferQueueTest {
    @Test
    void circularbuffercheck(){
        CircularBufferQueue buffer= new CircularBufferQueue(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, buffer.displayBuffer());
        System.out.println("Buffer after inserting 1, 2, 3: " + java.util.Arrays.toString(buffer.displayBuffer()));

        // Insert another element (this will overwrite the oldest element)
        buffer.insert(4);

        // Check the buffer content after overwriting
        Assertions.assertArrayEquals(new int[]{2, 3, 4}, buffer.displayBuffer());
        System.out.println("Buffer after inserting 4: " + java.util.Arrays.toString(buffer.displayBuffer()));
    }

}
