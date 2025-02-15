package checkedexception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckedExceptionTest {
    private static final String TEST_FILE = "test_examplefil.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.write(Paths.get(TEST_FILE), "Test content\nSecond line".getBytes());
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testReadFileContents() throws IOException {
        String expected = "Test content\nSecond line";
        String actual = CheckedException.readFileContents(TEST_FILE);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNotFound() {
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            CheckedException.readFileContents("non_existent.txt");
        });

        assertNotNull(exception);
    }
}