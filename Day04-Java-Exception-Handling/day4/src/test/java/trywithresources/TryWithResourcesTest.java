package trywithresources;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TryWithResourcesTest {
    private static final String TEST_FILE="test_info.txt";
    @Test
    void testReadFirstLine() throws IOException{
        Files.write(Paths.get(TEST_FILE),"Hello, World!\nSecond line".getBytes());
        String firstLine = TryWithResourcesExample.readFirstLine(TEST_FILE);
        assertEquals("Hello, World!", firstLine);

        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
    void testFileNotFound() {
        String firstLine = TryWithResourcesExample.readFirstLine("non_existent.txt");
        assertNull(firstLine);
    }
}
