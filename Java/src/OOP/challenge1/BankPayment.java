package OOP.challenge1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BankPayment implements PaymentService {
    private String accountName;
    private LocalDateTime dateTime;
    private BigDecimal amount;
    private String paymentMethod;

    public BankPayment(String accountName, String paymentMethod) {
        this.accountName = accountName;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void pay(BigDecimal amount) {
        if (amount == null) {
            throw new RuntimeException("Please provide a valid value");
        }

        try {
            this.amount = amount;
            this.dateTime = LocalDateTime.now();

        } catch (Exception e) {

        }
    }
}
