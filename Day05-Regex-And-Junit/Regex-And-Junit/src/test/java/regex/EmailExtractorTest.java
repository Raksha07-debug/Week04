package regex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class EmailExtractorTest {

    @Test
    public void testExtractValidEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> emails = ExtractEmail.extractEmail(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("support@example.com"));
        assertTrue(emails.contains("info@company.org"));
    }

    @Test
    public void testExtractNoEmails() {
        String text = "This text has no email addresses.";
        List<String> emails = ExtractEmail.extractEmail(text);

        assertTrue(emails.isEmpty());
    }

}
