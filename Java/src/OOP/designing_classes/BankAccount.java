package OOP.designing_classes;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;

    public BankAccount(BigDecimal initialBalance) {
        if (initialBalance == null || initialBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Initial balance must be >= 0");
        }
        this.balance = initialBalance;
    }

    public synchronized void deposit(BigDecimal amount) {
        validateAmount(amount);
        balance = balance.add(amount);
    }

    public synchronized BigDecimal withdraw(BigDecimal amount) {
        validateAmount(amount);

        if (balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient balance");
        }

        balance = balance.subtract(amount);
        return amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
