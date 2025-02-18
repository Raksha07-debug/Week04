package annotation;

import annotation.deprecated.LegacyAPI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeprecatedTest {
    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();


        assertTrue(api.newMethod().contains("this is a new method"));
    }

    @Test
    @SuppressWarnings("deprecation")
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        assertTrue(api.oldMethod().contains("Warning: This feature is deprecated and may be removed in future versions"));
    }
}
