package annotation.deprecated;

public class DeprecatedClass {
    public static void main(String[] args) {
        LegacyAPI legacy= new LegacyAPI();
        System.out.println(legacy.oldMethod());
        System.out.println(legacy.newMethod());
    }
}
