package wordcount;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;

class WordCountTest {
    @Test
    void testCountWords() {
        String testFilePath = "test_file.txt";
        String testData = "Java is great. Java is powerful. Java is popular. Python is also popular.";

        try (FileWriter writer = new FileWriter(testFilePath)) {
            writer.write(testData);
        } catch (IOException e) {
            fail("Failed to create test file: " + e.getMessage());
        }


        Map<String, Integer> answer =WordCount.countWords(testFilePath);


        assertTrue(WordCount.totalWords==13);
        assertTrue(answer.containsKey("java") && answer.get("java")==3);



        new File(testFilePath).delete();
    }
}
