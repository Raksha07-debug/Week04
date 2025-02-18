package reflection.accessandmodify;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Configure.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Original API_KEY: " + Configure.getApiKey());

        field.set(null, "128997552");

        System.out.println("Modified API_KEY: " + Configure.getApiKey());
    }
}
