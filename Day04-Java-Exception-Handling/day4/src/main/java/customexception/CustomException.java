package customexception;

import java.util.Scanner;

public class CustomException {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted ");

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("enter age ");
            int age= sc.nextInt();
            validateAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println("Error"+e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error "+e.getMessage());
        }

    }
}
