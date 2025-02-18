package reflection;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import reflection.getclassinformation.GetClassInformation;

public class GetClassInformationTest {

    @Test
    public void testGetClassInformation_PersonClass() {
        String className = "Person";
        String result = GetClassInformation.getClassInformation(className);

        assertTrue(result.contains("Class: reflection.getclassinformation.Person"));
        assertTrue(result.contains("getName"));
        assertTrue(result.contains("getAge"));
        assertTrue(result.contains("setName"));
        assertTrue(result.contains("setAge"));
        assertTrue(result.contains("displayDetails"));
        assertTrue(result.contains("privateMethod"));
        assertTrue(result.contains("Fields:"));
        assertTrue(result.contains("name"));
        assertTrue(result.contains("age"));
        assertTrue(result.contains("Person"));
    }

    @Test
    public void testGetClassInformation_ClassNotFound() {
        String className = "Raksha";
        String result = GetClassInformation.getClassInformation(className);

        assertTrue(result.contains("Class not found: Raksha"));
    }
}
