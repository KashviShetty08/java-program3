package bank;

class Account 
{
    private String accNo;
    private String name;
    private double balance;

    public Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new ArithmeticException("Deposit amount must be greater than 0.");
        }
        balance += amount;
        System.out.println("Deposited Amount: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new ArithmeticException("Withdrawal amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("You have insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn Amount: " + amount + " | New Balance: " + balance);
    }

    public void showBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

