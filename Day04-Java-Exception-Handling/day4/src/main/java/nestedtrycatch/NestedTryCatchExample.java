package nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatchExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                int[] numbers = {10, 20, 30, 40, 50};

                System.out.print("Enter the index: ");
                int index = scanner.nextInt();

                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();

                try {
                    int value = numbers[index];

                    try {
                        int result = value / divisor;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero!");
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid array index!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
    }