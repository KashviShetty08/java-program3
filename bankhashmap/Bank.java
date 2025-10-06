package bank;

import java.util.HashMap;

public class Bank {
    private HashMap<String, Double> accounts = new HashMap<>();

    // Create a new account
    public void createAccount(String accNo, double balance) {
        accounts.put(accNo, balance);
        System.out.println("Account " + accNo + " created with balance " + balance);
    }

    // Deposit money
    public void deposit(String accNo, double amt) {
        if (accounts.containsKey(accNo)) {
            double newBalance = accounts.get(accNo) + amt;
            accounts.put(accNo, newBalance);
            System.out.println("Deposited " + amt + " into " + accNo + " → Balance = " + newBalance);
        } else {
            System.out.println("Account " + accNo + " not found!");
        }
    }

    // Withdraw money
    public void withdraw(String accNo, double amt) {
        if (accounts.containsKey(accNo)) {
            double balance = accounts.get(accNo);
            if (balance >= amt) {
                double newBalance = balance - amt;
                accounts.put(accNo, newBalance);
                System.out.println("Withdrew " + amt + " from " + accNo + " → Balance = " + newBalance);
            } else {
                System.out.println("Insufficient balance in account " + accNo);
            }
        } else {
            System.out.println("Account " + accNo + " not found!");
        }
    }

    // Check balance
    public void checkBalance(String accNo) {
        if (accounts.containsKey(accNo)) {
            System.out.println("Account " + accNo + " → Balance = " + accounts.get(accNo));
        } else {
            System.out.println("Account " + accNo + " not found!");
        }
    }
}
