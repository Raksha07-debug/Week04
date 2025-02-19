package annotation;

import annotation.customannotation.TaskManager;
import annotation.markingimportantmethod.ImportantMethod;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImportantMethodTesting {
    @Test
    void testImportantMethodsAnnotation() {
        Class<?> cls = TaskManager.class;
        Method[] methods = cls.getDeclaredMethods();

        int importantMethodsCount = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                assertNotNull(annotation, "Annotation should not be null");
                importantMethodsCount++;

                if (method.getName().equals("processCriticalTask")) {
                    assertEquals("HIGH", annotation.level());
                } else if (method.getName().equals("processRegularTask")) {
                    assertEquals("MEDIUM", annotation.level());
                }
            }
        }
        assertEquals(0, importantMethodsCount);
    }
}
