package Slip13;

import java.util.Scanner;

public class Q1 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = scanner.nextInt();
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } finally {
            scanner.close();
        }
    }
}