package bank;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter your account number: ");
            String accountNo = scanner.nextLine();

            System.out.print("Please enter the account holder name: ");
            String name = scanner.nextLine();

            System.out.print("Please enter opening balance: ");
            double openingBalance = scanner.nextDouble();

            Account account = new Account(accountNo, name, openingBalance);

            while (true) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance");
                System.out.println("4. Exit");

                System.out.print("Please choose an option: ");
                int choice;

                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.nextLine(); // clear invalid input
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        try {
                            double amount = scanner.nextDouble();
                            account.deposit(amount);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid amount! Please enter a numeric value.");
                            scanner.nextLine();
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        try {
                            double amount = scanner.nextDouble();
                            account.withdraw(amount);
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter a numeric value.");
                            scanner.nextLine();
                        } catch (ArithmeticException | InsufficientBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        account.showBalance();
                        break;

                    case 4:
                        System.out.println("THANK YOU!");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice! Please enter between 1 to 4.");
                }
            }

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
