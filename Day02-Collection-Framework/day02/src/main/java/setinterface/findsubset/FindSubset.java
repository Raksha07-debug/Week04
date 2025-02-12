package setinterface.findsubset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubset {

        public static void main(String[] args) {
            // Creating two sets
            HashSet<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
            HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

            // Printing the result.
            System.out.println("Is the two set are subset of each othet "+isSubSet(set1,set2)); // Output: true
        }
        public static boolean isSubSet(HashSet<Integer> set1,HashSet<Integer> set2){
            boolean isSubset = set2.containsAll(set1);
            return isSubset;

        }
    }


