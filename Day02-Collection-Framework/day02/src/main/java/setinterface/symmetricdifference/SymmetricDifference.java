package setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.List;

public class SymmetricDifference {
    public static void main(String[] args) {
        // Example usage: Creating two HashSets
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

        // Printing the symmetric difference of the two sets.
        System.out.println("The output will be " + symmetricDifference(set1, set2));

    }


    public static HashSet<Integer> symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Create a new HashSet to store the symmetric difference
        HashSet<Integer> symmetricDiff = new HashSet<>();

        // Iterate through the first set and add elements that are not in the second set
        for (Integer element : set1) {
            if (!set2.contains(element)) {
                symmetricDiff.add(element);
            }
        }

        // Iterate through the second set and add elements that are not in the first set
        for (Integer element : set2) {
            if (!set1.contains(element)) {
                symmetricDiff.add(element);
            }
        }

        // Return the HashSet containing the symmetric difference
        return symmetricDiff;
    }
}
