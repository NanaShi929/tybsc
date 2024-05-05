package bank;

public class BankAccountTest {
    public static void main(String[] args) {
        // Test the base class BankAccount
        BankAccount account1 = new BankAccount("A12345", 1000.0);
        try {
            account1.withdraw(500.0);
            account1.deposit(200.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());

        // Test the derived class SavingsAccount
        SavingsAccount account2 = new SavingsAccount("S67890", 2000.0, 0.05);
        try {
            account2.withdraw(1500.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        account2.deposit(300.0);
        double interest = account2.calculateInterest();
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Interest: " + interest);
    }
}
