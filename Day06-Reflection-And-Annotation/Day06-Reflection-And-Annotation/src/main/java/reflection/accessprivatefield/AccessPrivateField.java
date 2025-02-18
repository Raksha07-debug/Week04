package reflection.accessprivatefield;
import java.lang.reflect.Field;
import java.lang. NoSuchFieldException;
public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person person=new Person();
        Class<?> cls=person.getClass();
        Field field1= cls.getDeclaredField("name");
        Field field2=cls.getDeclaredField("age");

        field1.setAccessible(true);
        field2.setAccessible(true);

        System.out.println(field1.get(person));
        System.out.println(field2.get(person));

        field1.set(person,"Savi");
        field2.set(person,98);
        System.out.println(field1.get(person));
        System.out.println(field2.get(person));
    }



}
