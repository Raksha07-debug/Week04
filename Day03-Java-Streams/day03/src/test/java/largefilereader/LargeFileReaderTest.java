package largefilereader;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class LargeFileReaderTest {
    @Test
    void testReadLargeFile() {
        String testFilePath = "largefile.txt";
        String testData = "This is a test.\nAn error occurred.\nAnother line.\nERROR detected here.\n";

        try (FileWriter writer = new FileWriter(testFilePath)) {
            writer.write(testData);
        } catch (IOException e) {
            fail("Failed to create test file: " + e.getMessage());
        }

        String ans=LargeFileReader.readLargeFile(testFilePath);

        String expectedOutput = "An error occurred.\nERROR detected here.\n";
        assertEquals(expectedOutput,ans);

        new File(testFilePath).delete();
    }
}
