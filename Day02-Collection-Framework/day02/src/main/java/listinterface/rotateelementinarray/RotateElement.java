package listinterface.rotateelementinarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateElement {
    public static void main(String[] args) {
        // Create an ArrayList to hold the elements
        List<Integer> list = new ArrayList<>();
        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Print the original list
        System.out.println("Original list: " + list);

        // Number of positions to rotate the list by
        int rotateBy = 2;

        // Rotate the list and print the rotated list
        System.out.println("Rotated list: " + rotateArr(list, rotateBy));
    }

    // Method to rotate the list by a given number of positions
    public static List<Integer> rotateArr(List<Integer> list, int position) {
        int length = list.size();

        // Calculate the effective number of positions to rotate
        position = position % length;

        // Create a new list to hold the rotated elements
        List<Integer> rotateList = new ArrayList<>(list);

        // Rotate the list to the left by the calculated number of positions
        Collections.rotate(rotateList, -position);

        // Return the rotated list
        return rotateList;
    }
}
