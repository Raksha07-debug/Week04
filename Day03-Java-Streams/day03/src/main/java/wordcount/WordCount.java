package wordcount;

import java.io.*;
import java.util.*;

public class WordCount {
    public static int totalWords = 0;
    public static  Map<String, Integer> countWords(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        Map<String, Integer> answer = new LinkedHashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return answer;
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));


        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            totalWords += entry.getValue();
        }
        System.out.println("Total words in file: " + totalWords);




        System.out.println("Top 5 most frequently occurring words");
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            System.out.println(sortedList.get(i).getKey() + ": " + sortedList.get(i).getValue());
            answer.put(sortedList.get(i).getKey(),sortedList.get(i).getValue());
        }

        return answer;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Week04\\Day03-Java-Streams\\day03\\src\\examplefile.txt";
        countWords(filePath);
    }
}
