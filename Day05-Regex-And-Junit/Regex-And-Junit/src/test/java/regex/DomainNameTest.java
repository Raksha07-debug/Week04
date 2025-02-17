package regex;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomainNameTest {
    @Test
    void  validDomain(){
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> expected = Arrays.asList("https://www.google.com", "http://example.org");
        assertEquals(expected, DomainNameExtractor.extractDomain(text));

    }

    @Test
    public void testExtractLinks_EmptyString() {
        String text = "";
        List<String> expected = Arrays.asList();
        assertEquals(expected,  DomainNameExtractor.extractDomain(text));
    }
}
