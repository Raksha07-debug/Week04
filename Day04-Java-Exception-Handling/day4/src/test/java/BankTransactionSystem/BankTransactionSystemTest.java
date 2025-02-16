package BankTransactionSystem;


import banktransactionsystem.BankAccount;
import banktransactionsystem.InsufficientBalanceException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransactionSystemTest {

    @Test
    void testValidWithdrawal() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        BankAccount account = new BankAccount(300);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> account.withdraw(400));
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    void testNegativeAmount() {
        BankAccount account = new BankAccount(1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
        assertEquals("Invalid amount!", exception.getMessage());
    }
}
