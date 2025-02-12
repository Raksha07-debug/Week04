package aidrivenresumescreeningsystem;

public class ProductManager extends Jobrole {

    public ProductManager(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println("Product Manager : " + getName());  // Display the job role and candidate's name

    }
}
