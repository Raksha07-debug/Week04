package listinterface.findfrequencyofelements;

import java.util.*;

public class FindFrequency {



        public static void main(String[] args) {
            // Example input list
            List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

            // Call the method to count frequencies
            Map<String, Integer> frequencyMap = countFrequencies(list);

            // Print the frequency map
            System.out.println(frequencyMap);
        }

        // Method to count frequencies of elements in the list
        public static Map<String, Integer> countFrequencies(List<String> list) {
            Map<String, Integer> frequencyMap = new LinkedHashMap<>();

            // Iterate over the list and count frequencies
            for (String element : list) {
                frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            }

            return frequencyMap;
        }
    }


