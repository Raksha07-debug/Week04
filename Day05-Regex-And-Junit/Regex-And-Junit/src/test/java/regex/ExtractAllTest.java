package regex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Arrays;

public class ExtractAllTest {


    @Test
        public void testExtractCapitalizedWords() {
            String text = "Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
            List<String> expected = Arrays.asList("Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York");
            assertEquals(expected,ExtraxtAll.extractCapital(text));
        }

        @Test
        public void testExtractCapitalizedWords_EmptyString() {
            String text = "";
            List<String> expected = Arrays.asList();
            assertEquals(expected, ExtraxtAll.extractCapital(text));
        }
    }
