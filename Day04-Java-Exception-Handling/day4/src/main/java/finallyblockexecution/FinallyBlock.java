package finallyblockexecution;

import java.util.Scanner;

public class FinallyBlock {

    public static int divideNumbers(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            System.out.println("Operation completed.");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = divideNumbers(num1, num2);
            System.out.println("Result: " + result);
        } finally {
            scanner.close();
        }
    }
}
