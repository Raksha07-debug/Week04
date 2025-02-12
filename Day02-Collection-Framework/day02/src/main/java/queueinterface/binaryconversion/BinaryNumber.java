package queueinterface.binaryconversion;
import java.util.*;

public class BinaryNumber {



        public static void main(String[] args) {
            int N = 5; // You can change this value to generate more binary numbers

            // Calling the method to generate binary numbers
            Set<String> binaryNumbers = generateBinaryNumbers(N);

            // Printing the generated binary numbers
            System.out.println(binaryNumbers); // Output: ["1", "10", "11", "100", "101"]
        }

        public static Set<String> generateBinaryNumbers(int N) {
            // List to store the result
           Set<String> result = new LinkedHashSet<>();

            // Queue to generate binary numbers
            Queue<String> queue = new LinkedList<>();

            // Add the first binary number
            queue.add("1");

            // Iterate to generate the first N binary numbers
            for (int i = 0; i < N; i++) {
                // Remove the front element from the queue
                String current = queue.poll();
                result.add(current);

                // Generate the next two binary numbers and add them to the queue
                queue.add(current + "0");
                queue.add(current + "1");
            }

            return result;
        }
    }



