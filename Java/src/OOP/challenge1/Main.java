package OOP.challenge1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentService payment = new LoggingPaymentService(
                new RetryPaymentService(
                        new MpesaPayment(1234)
                )
        );

        payment.pay(new BigDecimal("-2000"));
    }
}
