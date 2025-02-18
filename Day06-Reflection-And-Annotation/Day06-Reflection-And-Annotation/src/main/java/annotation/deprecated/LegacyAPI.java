package annotation.deprecated;

public class LegacyAPI {
    @Deprecated
    public String  oldMethod(){
        return "Warning: This feature is deprecated and may be removed in future versions";
    }
    public static String newMethod(){
        return "this is a new method";

    }
}
