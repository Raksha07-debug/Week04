package annotation;

import annotation.useoverride.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverrideAnimalTest {
    @Test
    void testMakeSound(){
        Dog dog= new Dog();
        assertTrue(dog.makeSound().contains("Dog barks"));
    }
}
