package Slip6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Search for a phone number by name");
            System.out.println("2. Quit");

            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.print("Enter the name to search: ");
                String name = scanner.nextLine();
                searchPhoneNumber(name);
            } else if (choice == 2) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void searchPhoneNumber(String name) {
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("phone.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] entry = line.split(",");
                if (entry[0].trim().equals(name)) {
                    System.out.println("Phone number: " + entry[1].trim());
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Name not found in the phonebook.");
        }
    }
}