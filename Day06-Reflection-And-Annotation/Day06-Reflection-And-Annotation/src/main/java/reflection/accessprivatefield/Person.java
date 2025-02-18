package reflection.accessprivatefield;

public class Person {
    private  String name;
    private  int age;

    public Person(){
        this.name="Raksha";
        this.age=21;
    }


    public  void displayDetails(){
         System.out.println("Name: "+name+"Age "+age);
     }
}
