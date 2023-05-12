package Slip15;

import java.util.Scanner;

class Employee {
    protected String id;
    protected String name;
    protected String department;
    protected double salary;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        id = scanner.nextLine();
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter department: ");
        department = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bonus: ");
        bonus = scanner.nextDouble();
    }

    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }

    public double getTotalSalary() {
        return salary + bonus;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of managers: ");
        int n = scanner.nextInt();

        Manager[] managers = new Manager[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for manager " + (i + 1) + ":");
            Manager manager = new Manager();
            manager.accept();
            managers[i] = manager;
        }

        System.out.println("\nManager details with total salary:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nManager " + (i + 1) + " details:");
            managers[i].display();
            System.out.println("Total Salary: " + managers[i].getTotalSalary());
        }
    }
}