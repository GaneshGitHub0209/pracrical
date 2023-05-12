package Slip10;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Series Generator");
        System.out.println("a. Prime Numbers");
        System.out.println("b. Fibonacci Series");
        System.out.println("c. Squares of Numbers");
        System.out.print("Enter your choice (a, b, or c): ");
        char choice = scanner.nextLine().charAt(0);

        switch (choice) {
            case 'a':
                System.out.print("Enter the number of prime numbers to generate: ");
                int primeCount = scanner.nextInt();
                generatePrimeNumbers(primeCount);
                break;
            case 'b':
                System.out.print("Enter the number of Fibonacci terms to generate: ");
                int fibCount = scanner.nextInt();
                generateFibonacciSeries(fibCount);
                break;
            case 'c':
                System.out.print("Enter the number of squares to generate: ");
                int squareCount = scanner.nextInt();
                generateSquares(squareCount);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }

        scanner.close();
    }

    public static void generatePrimeNumbers(int n) {
        System.out.println("Prime Numbers:");
        int count = 0;
        int num = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static void generateFibonacciSeries(int n) {
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void generateSquares(int n) {
        System.out.println("Squares of Numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
}