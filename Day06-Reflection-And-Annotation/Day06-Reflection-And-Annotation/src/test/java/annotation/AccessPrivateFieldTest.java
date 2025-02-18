package annotation;
import org.junit.jupiter.api.Test;
import reflection.accessprivatefield.Person;

import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class AccessPrivateFieldTest {
    @Test
    public void testPrivateFieldModification() throws Exception {
        Person person = new Person();

        Class<?> cls = person.getClass();

        Field nameField = cls.getDeclaredField("name");
        Field ageField = cls.getDeclaredField("age");

        nameField.setAccessible(true);
        ageField.setAccessible(true);

        assertEquals("Raksha", nameField.get(person));
        assertEquals(21, ageField.get(person));

        nameField.set(person, "SD");
        ageField.set(person, 21);

        assertEquals("SD", nameField.get(person));
        assertEquals(21, ageField.get(person));

        person.displayDetails();
    }
}
