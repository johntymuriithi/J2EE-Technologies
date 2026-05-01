package OOP.challenge1;

import java.lang.annotation.Documented;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CardPayment implements PaymentService {
    private Integer cardNo;
    private String cardName;
    private BigDecimal amount;

    public CardPayment(Integer cardNo, String cardName) {
        this.cardName = cardName;
        this.cardNo = cardNo;


    }

    @Override
    public void pay(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount cannot be null");
        }

        try {
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Card payment of " + amount + " at " + now);

        } catch (Exception e) {
            throw new RuntimeException("Payment failed ", e);
        }
    }
}
