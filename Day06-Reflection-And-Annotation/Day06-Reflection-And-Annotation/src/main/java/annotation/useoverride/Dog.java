package annotation.useoverride;

public class Dog  extends Animal{
    @Override
    public String makeSound(){
        return "Dog barks";
    }

}
