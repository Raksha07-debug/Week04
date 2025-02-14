package filehandling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.io.*;

class ReadWriteFileTest {

    private static final String TEST_SOURCE_FILE = "input.txt";
    private static final String TEST_DEST_FILE = "output.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (FileOutputStream fos = new FileOutputStream(TEST_SOURCE_FILE)) {
            fos.write("Testing exception handling!".getBytes());
        }
    }

    @Test
    void testReadFile_DoesNotThrowException() {
        assertDoesNotThrow(() -> ReadWriteFile.readFile(TEST_SOURCE_FILE));
    }

    @Test
    void testReadFile_NonExistentFile_DoesNotThrowException() {
        assertDoesNotThrow(() -> ReadWriteFile.readFile("non_existing.txt"));
    }

    @Test
    void testWriteFile_DoesNotThrowException() {
        assertDoesNotThrow(() -> ReadWriteFile.writeFile(TEST_DEST_FILE, "Test content"));
    }

    @Test
    void testWriteFile_NullContent_DoesNotThrowException() {
        assertDoesNotThrow(() -> ReadWriteFile.writeFile(TEST_DEST_FILE, null));
    }

    @AfterEach
    void tearDown() {
        new File(TEST_SOURCE_FILE).delete();
        new File(TEST_DEST_FILE).delete();
    }
}
