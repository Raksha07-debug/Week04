package listinterface.findnthelementfromend;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.E;

public class FindNthElement {
    public static void main(String[] args) {
        // Create a LinkedList with elements ["A", "B", "C", "D", "E"]
        List<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        // Number of positions from the end
        int n = 2;

        // Print the Nth element from the end
        System.out.println("Output will be: " + result(list, n));
    }

    // Method to find the Nth element from the end
    public static String result(List<String> list, int n) {
        // Reverse the list
        Collections.reverse(list);

        // Return the Nth element from the reversed list.
        return list.get(n - 1);
    }
}
