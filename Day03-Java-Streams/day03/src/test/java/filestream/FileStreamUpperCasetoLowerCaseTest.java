package filestream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

class FileStreamUpperToLowerConverterTest {
    private static final String INPUT_FILE = "test_input.txt";
    private static final String OUTPUT_FILE = "test_output.txt";

    @BeforeEach
    void setUp() throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE))) {
            writer.write("HELLO WORLD\nTHIS IS A TEST FILE.");
        }
    }

    @AfterEach
    void tearDown() {
        new File(INPUT_FILE).delete();
        new File(OUTPUT_FILE).delete();
    }

    @Test
    void testConvertToLowercase() throws IOException {
        FileStreamUpperToLowerConverter.convertToLowercase(INPUT_FILE, OUTPUT_FILE);

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(OUTPUT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        }

        String expected = "hello world\nthis is a test file.\n";

        assertEquals(expected, result.toString());
    }
}
