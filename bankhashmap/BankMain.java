package bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        
        bank.createAccount("BXB1022", 50000);
        bank.createAccount("BXB1021", 20000);

        bank.deposit("BXB1022", 1000);
        bank.withdraw("BXB1021", 500);

        System.out.println("Final balances:");
        bank.checkBalance("BXB1022");
        bank.checkBalance("BXB1021");
    }
}
