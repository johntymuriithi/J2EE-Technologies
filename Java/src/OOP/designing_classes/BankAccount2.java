package OOP.designing_classes;

import java.math.BigDecimal;

public final class BankAccount2 {
    private final BigDecimal balance;

    public BankAccount2(BigDecimal balance) {
        if (balance == null || balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }
        this.balance = balance;
    }

    public BankAccount2 deposit(BigDecimal amount) {
        validate(amount);
        return new BankAccount2(balance.add(amount));
    }

    public BankAccount2 withdraw(BigDecimal amount) {
        validate(amount);

        if (balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient balance");
        }

        return new BankAccount2(balance.subtract(amount));
    }

    public BigDecimal getBalance() {
        return balance;
    }

    private void validate(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
    }
}