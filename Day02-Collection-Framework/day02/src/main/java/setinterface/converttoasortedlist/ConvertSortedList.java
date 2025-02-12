package setinterface.converttoasortedlist;

import java.util.*;

public class ConvertSortedList {

    public static void main(String[] args) {
        // Creating a HashSet of integers
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Converting HashSet to a List
        List<Integer> list = new ArrayList<>(hashSet);

        // Sorting the list in ascending order
        Collections.sort(list);

        // Printing the sorted list
        System.out.println(list); // Output: [1, 3, 5, 9]
    }

    public static List<Integer> sorted(HashSet<Integer> hashSet) {
        // Converting HashSet to a List
        List<Integer> list = new ArrayList<>(hashSet);

        // Sorting the list in ascending order
        Collections.sort(list);

        // Returning the sorted list
        return list;
    }
}
