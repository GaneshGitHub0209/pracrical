package Slip1;

import java.sql.*;

public class Q2 {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";
        
        // SQL statements
        String createTableQuery = "CREATE TABLE IF NOT EXISTS Student (rollno INT PRIMARY KEY, sname VARCHAR(50), class VARCHAR(10), percentage FLOAT)";
        String insertRecordQuery = "INSERT INTO Student (rollno, sname, class, percentage) VALUES (?, ?, ?, ?)";
        
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Create the Student table
            Statement createTableStatement = connection.createStatement();
            createTableStatement.executeUpdate(createTableQuery);
            System.out.println("Student table created successfully.");
            
            // Accept user input for student details
            int rollno = getIntegerInput("Enter Roll No: ");
            String sname = getStringInput("Enter Student Name: ");
            String sclass = getStringInput("Enter Class: ");
            float percentage = getFloatInput("Enter Percentage: ");
            
            // Insert record into the Student table
            PreparedStatement insertStatement = connection.prepareStatement(insertRecordQuery);
            insertStatement.setInt(1, rollno);
            insertStatement.setString(2, sname);
            insertStatement.setString(3, sclass);
            insertStatement.setFloat(4, percentage);
            insertStatement.executeUpdate();
            
            System.out.println("Record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static int getIntegerInput(String message) {
        System.out.print(message);
        try {
            return Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer value.");
            return getIntegerInput(message);
        }
    }
    
    private static String getStringInput(String message) {
        System.out.print(message);
        return System.console().readLine();
    }
    
    private static float getFloatInput(String message) {
        System.out.print(message);
        try {
            return Float.parseFloat(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return getFloatInput(message);
        }
    }
}