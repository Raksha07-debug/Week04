package mapinterface.implementabankingsystem;

import java.util.*;

public class BankingSystem {
    private static Map<String, Double> accountBalances = new HashMap<>();
    private static TreeMap<Double, String> sortedByBalance = new TreeMap<>();
    private static Queue<String> withdrawalQueue = new LinkedList<>();

    public static void addAccount(String accountNumber, double initialBalance) {
        accountBalances.put(accountNumber, initialBalance);
        sortedByBalance.put(initialBalance, accountNumber);
    }

    public static void deposit(String accountNumber, double amount) {
        if (!accountBalances.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }

        double newBalance = accountBalances.get(accountNumber) + amount;
        sortedByBalance.remove(accountBalances.get(accountNumber));
        sortedByBalance.put(newBalance, accountNumber);
        accountBalances.put(accountNumber, newBalance);
    }

    public static void requestWithdrawal(String accountNumber) {
        if (!accountBalances.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        withdrawalQueue.add(accountNumber);
    }

    public static void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            if (accountBalances.get(accountNumber) >= amount) {
                double newBalance = accountBalances.get(accountNumber) - amount;
                sortedByBalance.remove(accountBalances.get(accountNumber));
                sortedByBalance.put(newBalance, accountNumber);
                accountBalances.put(accountNumber, newBalance);
                System.out.println("Withdrawal successful for account: " + accountNumber);
            } else {
                System.out.println("Insufficient balance for account: " + accountNumber);
            }
        }
    }

    public static double getBalance(String accountNumber) {
        return accountBalances.getOrDefault(accountNumber, -1.0);
    }

    public static Map<Double, String> getSortedByBalance() {
        return sortedByBalance;
    }

    public static void main(String[] args) {
        addAccount("BR05", 5000);
        addAccount("MP04", 3000);
        addAccount("BR06", 7000);

        deposit("BR05", 2000);
        deposit("BR06", 500);

        requestWithdrawal("BR05");
        requestWithdrawal("MP04");
        processWithdrawals(1000);

        System.out.println("Sorted by Balance " + getSortedByBalance());
    }
}
