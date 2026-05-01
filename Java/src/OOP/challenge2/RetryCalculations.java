package OOP.challenge2;

public class RetryCalculations implements Calculations {
    // we need to use delegate-composition here  > Enables composition (HAS-A)
    private final AdditionLogic delegate;

    public RetryCalculations(AdditionLogic delegate) {
        this.delegate = delegate;
    }

    @Override
    public void add(Integer augend, Integer addend) {
        int attempts = 3;

        for (int i = 0; i < attempts; i++) {
            try {
                delegate.add(augend, addend);
                return;
            } catch (Exception e) {
                if (i == attempts - 1) throw e;
            }
        }
    }
}
