package reflection;

import org.junit.jupiter.api.Test;
import reflection.accessandmodify.Configure;

import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class ModifyStaticFieldTest {

    @Test
    public void testModifyStaticField() throws Exception {
        Class<?> clazz = Configure.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "975542");

        assertEquals("975542", Configure.getApiKey());
    }
}
