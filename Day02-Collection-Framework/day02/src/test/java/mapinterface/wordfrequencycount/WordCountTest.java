package mapinterface.wordfrequencycount;

import mapinterface.wordfrequencycounter.WordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountTest {
    @Test
    void testGetWords() {
        // Path to the input text file
        String filePath = "C:\\Week03\\Day06\\file1.txt";

        // Get words from the file
        List<String> actualWords = WordCounter.getWords(filePath); // Fixed method call

        // Expected list of words
        List<String> expectedWords = List.of("hello", "world", "hello", "java");

        // Assert that the actual words match the expected words
        Assertions.assertEquals(expectedWords, actualWords);
    }

    // Test the countFrequency method
    @Test
    void testFreqCount() {
        // Path to the input text file
        String filePath = "C:\\Week03\\Day06\\file1.txt";

        // Get words from the file
        List<String> actualWords = WordCounter.getWords(filePath);

        // Count word frequency
        Map<String, Integer> freqCount = WordCounter.countFrequency(actualWords.toString()); // Fixed method call

        // Expected word frequency map
        Map<String, Integer> expectedFreq = Map.of("world", 1, "java", 1, "hello", 2);

        // Assert that the actual frequency map matches the expected frequency map
        Assertions.assertEquals(expectedFreq, freqCount);
    }
}
