package queueinterface.circularbufferqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBufferQueue {
    int head; // Index of the oldest element in the buffer
    int tail; // Index of the newest element in the buffer
    private static int[] buffer; // Array to store buffer elements
    int size; // Maximum size of the buffer
    int count; // Number of elements currently in the buffer
    Queue<Integer> queue; // Queue to help manage the buffer

    public CircularBufferQueue(int size) {
        buffer = new int[size]; // Initialize the buffer array with the given size
        head = 0; // Initialize the head index
        tail = 0; // Initialize the tail index
        this.size = size; // Set the buffer size
        queue = new LinkedList<>(); // Initialize the queue
        count = 0; // Initialize the count of elements
    }

    // Method to insert an element into the buffer
    public void insert(int ele) {
        buffer[tail] = ele; // Add the element at the tail index
        tail = (tail + 1) % size; // Update the tail index (wrap around if necessary)
        if (count == size) {
            head = (head + 1) % size; // If buffer is full, update the head index to overwrite the oldest element
        } else {
            count++; // If buffer is not full, increment the count of elements
        }
    }

    // Method to display the elements in the buffer
    public int[] displayBuffer() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = buffer[(head + i) % size];
        }
        return result;
    }


    public static void main(String[] args) {
        CircularBufferQueue buffer = new CircularBufferQueue(3);

        buffer.insert(1); // Insert element 1
        buffer.insert(2); // Insert element 2
        buffer.insert(3); // Insert element 3
        System.out.println("Buffer: " + java.util.Arrays.toString(buffer.displayBuffer()));
        buffer.displayBuffer(); // Output: 1 2 3

        buffer.insert(4); // Insert element 4 (overwrites the oldest element, 1)
        System.out.println("Buffer: " + java.util.Arrays.toString(buffer.displayBuffer()));
        buffer.displayBuffer(); // Output: 2 3 4
    }
}
