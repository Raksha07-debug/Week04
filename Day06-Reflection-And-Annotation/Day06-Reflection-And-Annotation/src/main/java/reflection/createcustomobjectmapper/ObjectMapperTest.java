package reflection.createcustomobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperTest {
    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Raksha");
        properties.put("age", 7);
        properties.put("city", "Bhopal");

        Person person = CustomObjectMapper.toObject(Person.class, properties);

        person.displayDetails();
    }
}
