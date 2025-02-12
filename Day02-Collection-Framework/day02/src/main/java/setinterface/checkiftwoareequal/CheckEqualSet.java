package setinterface.checkiftwoareequal;

import java.util.HashSet;
import java.util.function.Supplier;

public class CheckEqualSet {
    public static void main(String[] args) {
        // Create the first HashSet with elements 1, 2, 3
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second HashSet with elements 3, 2, 1
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Check if the two sets are equal and print the result
        System.out.println("Are the two sets equal: " + isEqual(set1, set2));
    }

    // Method to check if two sets are equal
    public static boolean isEqual(HashSet<Integer> set1, HashSet<Integer> set2) {
        return set1.equals(set2);
    }
}
