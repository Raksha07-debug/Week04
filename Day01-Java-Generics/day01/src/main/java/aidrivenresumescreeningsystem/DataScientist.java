package aidrivenresumescreeningsystem;

public class DataScientist extends  Jobrole{
    public DataScientist(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println("Data Scientist: " + getName());  // Display the job role and candidate's name

    }
}
