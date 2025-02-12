package setinterface.intersectionandunionofset;

import java.util.HashSet;
import java.util.List;

public class IntersectionAndUnion {
    public static void main(String[] args) {
        // Create the first HashSet with elements 1, 2, 3
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3));

        // Create the second HashSet with elements 3, 4, 5
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

        // Print the union of the two sets
        System.out.println("Union of two sets: " + unionOfSet(set1, set2));

        // Print the intersection of the two sets
        System.out.println("Intersection of two sets: " + intersectionOfSet(set1, set2));
    }

    // Method to find the union of two sets
    public static HashSet<Integer> unionOfSet(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Create a new HashSet to hold the union of the two sets
        HashSet<Integer> unionSet = new HashSet<>();

        // Add all elements from the first set to the union set
        unionSet.addAll(set1);

        // Add all elements from the second set to the union set
        unionSet.addAll(set2);

        // Return the union set
        return unionSet;
    }

    // Method to find the intersection of two sets
    public static HashSet<Integer> intersectionOfSet(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Create a new HashSet to hold the intersection of the two sets
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Iterate over the elements of the first set
        for (Integer i : set1) {
            // If the second set contains the element, add it to the intersection set
            if (set2.contains(i)) {
                intersectionSet.add(i);
            }
        }

        // Return the intersection set
        return intersectionSet;
    }
}
