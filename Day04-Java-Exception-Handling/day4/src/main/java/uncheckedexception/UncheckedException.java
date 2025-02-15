package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static int divide(int numerator,int denominator){
        if(denominator==0){
            throw new ArithmeticException("divide by zero is not allowed");
        }
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("enter value for numerator");
            int numerator=sc.nextInt();
            System.out.println("enter value for denominator ");
            int denominator=sc.nextInt();
            int result=divide(numerator,denominator);
            System.out.println("result is "+result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error: "+e.getMessage());
        }
        catch (InputMismatchException e){
            throw new InputMismatchException(e.getMessage());
        }

    }
}
