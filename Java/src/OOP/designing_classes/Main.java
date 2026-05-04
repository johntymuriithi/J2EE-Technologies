package OOP.designing_classes;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(new BigDecimal("5000"));

        System.out.println(bankAccount.withdraw(new BigDecimal("5000")));

        System.out.println(bankAccount.getBalance());
    }
}
