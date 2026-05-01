package OOP.challenge1;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MpesaPayment implements PaymentService{
    private Integer pin;
    private BigDecimal amount;


    public MpesaPayment(Integer pin) {
        this.pin = pin;
    }

    @Override
    public void pay(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount cannot be null");
        }

        try {
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Mpesa payment of " + amount + " at " + DateTimeFormatter.ofPattern("E, MMM dd yyy HH:mm:ss").format(now));

        } catch (Exception e) {
            throw new RuntimeException("Payment failed ", e);
        }
    }
}
