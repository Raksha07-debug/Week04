package pipedstream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class PipedStreamExampleTest {
    @Test
    void testPipedStreamCommunication() {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writer = new Thread(() -> {
                try {
                    pos.write("Test Message".getBytes());
                    pos.close();
                } catch (IOException e) {
                    fail("Writer thread failed: " + e.getMessage());
                }
            });

            StringBuilder output = new StringBuilder();
            Thread reader = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        output.append((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    fail("Reader thread failed: " + e.getMessage());
                }
            });

            writer.start();
            reader.start();

            writer.join();
            reader.join();

            assertEquals("Test Message", output.toString());

        } catch (IOException | InterruptedException e) {
            fail("Test failed: " + e.getMessage());
        }
    }
}
