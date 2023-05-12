package Slip17;

import java.util.Scanner;

class Marks_Out_of_Bounds extends Exception {
    public Marks_Out_of_Bounds(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) throws Marks_Out_of_Bounds {
        if (marks > 100) {
            throw new Marks_Out_of_Bounds("Invalid marks! Marks should be between 0 and 100.");
        }
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        Student student = new Student();
        student.setName(name);

        try {
            student.setMarks(marks);
            System.out.println("Student details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Marks: " + student.getMarks());
        } catch (Marks_Out_of_Bounds e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}