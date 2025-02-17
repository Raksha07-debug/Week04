package regex;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractDateTest {


    @Test
    public void testExtractDates_ValidDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> expected = Arrays.asList("12/05/2023", "15/08/2024", "29/02/2020");
        assertEquals(expected, DateExtract.extractDate(text));
    }

    @Test
    public void testExtractDates_EmptyString() {
        String text = "";
        List<String> expected = Arrays.asList();
        assertEquals(expected, DateExtract.extractDate(text));
    }
}


