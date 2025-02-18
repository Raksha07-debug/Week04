package reflection.generatejsonrepresentation;

public class JsonConverter {
    public static void main(String[] args) {
        Person person = new Person("Raksha", 22, true);

        String jsonString = ObjectToJsonConverter.toJson(person);
        System.out.println(jsonString);
    }
}
