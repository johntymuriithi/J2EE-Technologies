package OOP.challenge1;

import java.math.BigDecimal;

public class LoggingPaymentService implements PaymentService {
    private final PaymentService delegate;

    public LoggingPaymentService(PaymentService delegate) {
        this.delegate = delegate;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Starting payment: " + amount);
        delegate.pay(amount);
        System.out.println("Payment completed");
    }
}
