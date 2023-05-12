package Slip15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        System.out.println("Even numbers:");
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }

        System.out.println("Odd numbers:");
        for (int oddNumber : oddNumbers) {
            System.out.println(oddNumber);
        }
    }
}