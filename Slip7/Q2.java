package Slip7;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class SavingAccount {
    private int acNo;
    private String name;
    private double balance;

    public SavingAccount(int acNo, String name, double balance) {
        this.acNo = acNo;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < 500) {
            throw new InsufficientFundsException("Insufficient funds. Minimum balance must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public void viewBalance() {
        System.out.println("Account balance: " + balance);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int acNo = scanner.nextInt();

        System.out.print("Enter account holder name: ");
        String name = scanner.next();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        SavingAccount account = new SavingAccount(acNo, name, balance);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        try {
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        account.viewBalance();

        scanner.close();
    }
}