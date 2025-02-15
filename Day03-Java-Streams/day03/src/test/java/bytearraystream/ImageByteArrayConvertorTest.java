package bytearraystream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.io.File;

class ImageByteArrayConverterTest {
    private static final String INPUT_IMAGE = "test_input.jpg";
    private static final String OUTPUT_IMAGE = "test_output.jpg";

    @BeforeEach
    void setUp() throws Exception {
        File file = new File(INPUT_IMAGE);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @AfterEach
    void tearDown() {
        new File(INPUT_IMAGE).delete();
        new File(OUTPUT_IMAGE).delete();
    }

    @Test
    void testImageToByteArray() {
        byte[] imageBytes = ImageByteArrayConverter.imageToByteArray(INPUT_IMAGE);
        assertNotNull(imageBytes);
        assertTrue(imageBytes.length >= 0);
    }

    @Test
    void testByteArrayToImage() {
        byte[] imageBytes = ImageByteArrayConverter.imageToByteArray(INPUT_IMAGE);
        assertNotNull(imageBytes);

    }

}
