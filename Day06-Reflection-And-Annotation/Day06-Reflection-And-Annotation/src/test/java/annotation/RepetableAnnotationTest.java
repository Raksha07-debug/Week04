package annotation;

import annotation.repetableannotation.BugReports;
import annotation.repetableannotation.BugTracker;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.AssertionsKt.assertNotNull;

public class RepetableAnnotationTest {
    @Test
    void testBugReportAnnotations() throws Exception {
        Class<?> cls = BugTracker.class;
        Method method = cls.getDeclaredMethod("process");

        assertTrue(method.isAnnotationPresent(BugReports.class), "BugReports annotation should be present");

        BugReports bugReports = method.getAnnotation(BugReports.class);
        assertNotNull(bugReports);
        assertEquals(2, bugReports.value().length, "There should be exactly 2 BugReport annotations");

        assertEquals("NullPointerException occurs on invalid input", bugReports.value()[0].description());
        assertEquals("Raksha", bugReports.value()[0].reportedBy());

        assertEquals("Performance issue when handling large data sets", bugReports.value()[1].description());
        assertEquals("sd", bugReports.value()[1].reportedBy());
    }
}
