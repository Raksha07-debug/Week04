package aidrivenresumescreeningsystem;

abstract public class Jobrole {
     String name;

    public Jobrole(String name){
    this.name=name;
}

    public String getName() {
        return name;
    }
    public abstract  void displayRole();
}
