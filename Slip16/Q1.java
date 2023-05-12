package Slip16;

public class Q1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
        
        // Get the number from command line argument
        String input = args[0];
        
        try {
            // Convert the input string to an integer
            int number = Integer.parseInt(input);
            
            // Calculate the sum of digits
            int sum = 0;
            int temp = number;
            
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            
            // Display the sum of digits
            System.out.println("Sum of digits: " + sum);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide a valid integer.");
        }
    }
}