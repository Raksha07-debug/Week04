package queueinterface.reversequeue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseQueueTest {
    @Test
    void reverseQueue() {
        // Creating a queue with initial elements
        Queue<Integer> queue = new LinkedList<>(List.of(10, 20, 30));

        // Expected output after reversing the queue
        Queue<Integer> output = new LinkedList<>(List.of(30, 20, 10));

        // Calling the reverseQueue method to reverse the queue
        ReverseQueue.reverseQueue(queue);

        // Asserting that the reversed queue matches the expected output
        Assertions.assertEquals(output, queue);
    }
}
