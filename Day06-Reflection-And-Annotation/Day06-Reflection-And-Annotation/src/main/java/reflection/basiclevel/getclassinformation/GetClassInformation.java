package reflection.basiclevel.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInformation {
    public static String getClassInformation(String className){
        StringBuilder sb= new StringBuilder();
        try{
            String fullClasName="reflection.getclassinformation."+className;
            Class<?> cls = Class.forName(fullClasName);
            sb.append("\nClass: ").append(cls.getName()).append("\n");
            sb.append("\nMethods: \n");
            Method[] methods=cls.getDeclaredMethods();
            for(Method method: methods){
                sb.append(method.getName()).append("\n");
            }
            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {
                sb.append(field.getName()).append("\n");
            }

            sb.append("\nConstructors:\n");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                sb.append(constructor.getName()).append("\n");
            }

        } catch (ClassNotFoundException e) {
            sb.append("Class not found: ").append(className);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.next();
        System.out.println(getClassInformation(className));
    }

}
