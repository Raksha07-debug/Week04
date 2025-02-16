package banktransactionsystem;


public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!"); // Negative amount exception
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!"); // Custom exception
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
