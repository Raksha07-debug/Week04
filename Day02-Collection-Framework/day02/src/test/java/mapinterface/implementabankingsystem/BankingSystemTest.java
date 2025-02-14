package mapinterface.implementabankingsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class BankingSystemTest {

    @BeforeEach
    void setUp() {
        BankingSystem.addAccount("BR05", 5000);
        BankingSystem.addAccount("MP04", 3000);
        BankingSystem.addAccount("BR06", 7000);
    }

    @Test
    void testDeposit() {
        BankingSystem.deposit("BR05", 2000);
        assertEquals(7000, BankingSystem.getBalance("BR05"));
    }

    @Test
    void testWithdrawalRequestAndProcessing() {
        BankingSystem.requestWithdrawal("MP04");
        BankingSystem.processWithdrawals(1000);
        assertEquals(2000, BankingSystem.getBalance("MP04"));
    }

    @Test
    void testSortedByBalance() {
        BankingSystem.deposit("A123", 2000);
        Map<Double, String> sorted = BankingSystem.getSortedByBalance();

        assertTrue(sorted.containsKey(7000.0));
        assertTrue(sorted.containsKey(3000.0));
    }
}
