package mapinterface.invertamap;
import java.util.*;


public class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // If the value is already in the invertedMap, add the key to the existing list
            if (invertedMap.containsKey(value)) {
                invertedMap.get(value).add(key);
            } else {
                // Otherwise, create a new list and add the key.
                List<K> keysList = new ArrayList<>();
                keysList.add(key);
                invertedMap.put(value, keysList);
            }
        }

        return invertedMap;
    }

    public static void main(String[] args) {

            Map<String, Integer> originalMap = new HashMap<>();
            originalMap.put("A", 1);
            originalMap.put("B", 2);
            originalMap.put("C", 1);

            Map<Integer, List<String>> invertedMap = invertMap(originalMap);

            // Print the inverted map
            for (Map.Entry<Integer, List<String>> entry : invertedMap.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

    }


