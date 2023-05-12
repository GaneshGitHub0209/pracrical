package Slip5;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0.0;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        department = "";
        salary = 0.0;
    }

    public class Manager {
        private double bonus;

        public Manager() {
            bonus = 0.0;
        }

        public Manager(double bonus) {
            this.bonus = bonus;
        }

        public void accept() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter manager's bonus: ");
            bonus = scanner.nextDouble();
        }

        public void display() {
            System.out.println("Manager Bonus: " + bonus);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, salary);
        Employee.Manager manager = employee.new Manager();

        manager.accept();
        manager.display();
    }
}