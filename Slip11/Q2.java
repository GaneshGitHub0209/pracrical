package Slip11;

import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int dd;
    private int mm;
    private int yy;
    
    public void accept() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the day: ");
        dd = scanner.nextInt();
        
        System.out.print("Enter the month: ");
        mm = scanner.nextInt();
        
        System.out.print("Enter the year: ");
        yy = scanner.nextInt();
        
        if (!isValidDate(dd, mm, yy)) {
            throw new InvalidDateException("Invalid date entered!");
        }
    }
    
    public void display() {
        System.out.println("Date: " + dd + "/" + mm + "/" + yy);
    }
    
    private boolean isValidDate(int day, int month, int year) {
        // Check if day, month, and year values are within valid ranges
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        
        // Perform additional validation based on specific rules for leap years, etc.
        // Add your custom validation logic here
        
        return true;
    }
}

public class Q2 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        
        try {
            date.accept();
            date.display();
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}