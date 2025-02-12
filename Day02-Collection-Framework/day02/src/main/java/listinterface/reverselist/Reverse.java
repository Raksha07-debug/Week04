package listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        // Create a LinkedList and add elements to it
        List<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(40);
        list.add(70);
        list.add(130);

        // Create an ArrayList and add elements to it
        List<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(30);
        arrList.add(50);

        // Print original lists
        System.out.println("Original List:");
        System.out.println("Array list: " + arrList);
        System.out.println("Linked list: " + list);

        // Reverse the lists
        reverseList(arrList);
        reverseList(list);

        // Print reversed lists
        System.out.println("After reversing the list:");
        System.out.println("Array list: " + arrList);
        System.out.println("Linked list: " + list);
    }

    // Method to reverse a list
    public static void reverseList(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at i and (size - 1 - i)
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
