package queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        //creating a queue
        Queue<Integer> queue= new LinkedList<>(List.of(10, 20, 30));
        // Reversing the queue
        reverseQueue(queue);

        // Printing the reversed queue
        System.out.println("Reversed  queue "+queue); // Output: [30, 20, 10]

    }
    public static void reverseQueue(Queue<Integer> queue){
        // creating a stack
        Stack<Integer> stack= new Stack<>();
        //adding elemnet in stack
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        // adding element in queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
