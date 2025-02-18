package reflection;

import org.junit.jupiter.api.Test;
import reflection.retrieveannotationatruntime.Author;

import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RetrieveAnnotationTest {
    @Test
    public void testAnnotationRetrieval() throws Exception {
        Class<?> cls = Class.forName("reflection.retrieveannotationatruntime.ExampleClass");

        assertTrue(cls.isAnnotationPresent(Author.class));

        Annotation annotation = cls.getAnnotation(Author.class);
        Author author = (Author) annotation;

        assertEquals("Raksha", author.name());
    }
}
