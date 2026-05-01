package OOP.challenge1;

import java.math.BigDecimal;

public class RetryPaymentService implements PaymentService {
    private final PaymentService delegate;  // making final makes t

    public RetryPaymentService(PaymentService delegate) {
        this.delegate = delegate;
    }

    @Override
    public void pay(BigDecimal amount) {
        int attempts = 3;

        for (int i = 0; i < attempts; i++) {
            try {
                delegate.pay(amount);
                return;
            } catch (Exception e) {
                if (i == attempts - 1) {
                    throw e;
                }
            }
        }
    }
}
