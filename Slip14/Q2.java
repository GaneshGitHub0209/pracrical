package Slip14;

public class Q2 {
    private int number;

    // Default constructor
    public Q2() {
        this.number = 0;
    }

    // Constructor with parameter
    public Q2(int number) {
        this.number = number;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return number < 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length > 0) {
            // Get the value from the command line argument
            int value = Integer.parseInt(args[0]);

            // Create a MyNumber object using the constructor with parameter
            Q2 myNumber = new Q2(value);

            // Perform the desired checks and display the results
            System.out.println("Number: " + value);
            System.out.println("Is Negative? " + myNumber.isNegative());
            System.out.println("Is Positive? " + myNumber.isPositive());
            System.out.println("Is Odd? " + myNumber.isOdd());
            System.out.println("Is Even? " + myNumber.isEven());
        } else {
            // No command line argument provided
            System.out.println("Please provide a value as a command line argument.");
        }
    }
}