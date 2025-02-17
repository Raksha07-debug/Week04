package junit;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(subtract(2,3));
        System.out.println(divide(2,3));
        System.out.println(multiply(2,3));
    }
}
