package bufferedstream;

import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

import filehandling.ReadWriteFile;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class BufferedStreamsTest {
    String INPUT_FILE = "examplefile.txt";
    String BUFFERED_OUTPUT = "Output.txt";
    String UNBUFFERED_OUTPUT = "out.txt";

    @BeforeEach
    void setUp() throws IOException {
        File inputFile = new File(INPUT_FILE);
        if (!inputFile.exists()) {
            Files.write(inputFile.toPath(), new byte[1024 * 1024]);
        }
    }

    @AfterEach
    void tearDown() {
        new File(INPUT_FILE).delete();
        new File(BUFFERED_OUTPUT).delete();
        new File(UNBUFFERED_OUTPUT).delete();
    }

    @Test
    void testCopyFileUsingBufferedStreams() {
      FileCopy.copyFileUsingBufferedStreams(INPUT_FILE, BUFFERED_OUTPUT);
        File outputFile = new File(BUFFERED_OUTPUT);

        assertTrue(outputFile.exists());

        assertEquals(new File(INPUT_FILE).length(), outputFile.length());
    }

    @Test
    void testCopyFileUsingUnbufferedStreams() {
        FileCopy.copyFileUsingUnbufferedStreams(INPUT_FILE, UNBUFFERED_OUTPUT);
        File outputFile = new File(UNBUFFERED_OUTPUT);

        assertTrue(outputFile.exists());

        assertEquals(new File(INPUT_FILE).length(), outputFile.length());
    }
}