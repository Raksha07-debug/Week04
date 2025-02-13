package queueinterface.implementqueueusingstack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    Queue<Integer> queue1 = new LinkedList<>(); // First queue to hold elements
    Queue<Integer> queue2 = new LinkedList<>(); // Second queue to assist in operations

    // Method to push element to the stack
    public void push(int x) {
        queue1.add(x); // Add element to the end of queue1
    }

    // Method to remove the top element from the stack
    public int pop() {
        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // The last element of queue1 is the top element of the stack
        int top = queue1.remove();

        // Swap the queues to keep queue1 as the main queue
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top; // Return the removed element
    }

    // Method to get the top element without removing it
    public int top() {
        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // Peek the last element of queue1 which is the top element of the stack
        int top = queue1.peek();
        queue2.add(queue1.remove());

        // Swap the queues to keep queue1 as the main queue
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top; // Return the top element
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty(); // Return true if queue1 is empty, otherwise false
    }
}
