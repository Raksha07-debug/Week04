package reflection;


import org.junit.jupiter.api.Test;
import reflection.dynamicobjectcreation.Student;

import java.lang.reflect.Constructor;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicObjectCreationTest {

    @Test
    public void testDynamicObjectCreation() throws Exception {
        Class<?> cls = Class.forName("reflection.dynamicobjectcreation.Student");

        Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
        Object obj = constructor.newInstance("Raksha", 22);

        assertNotNull(obj);

        Student student = (Student) obj;
        assertEquals("Raksha", student.getName());
        assertEquals(22, student.getAge());
    }
}
