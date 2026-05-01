package OOP.challenge2;

public class AdditionLogic implements Calculations {
    @Override
    public void add(Integer augend, Integer addend) {
        if (addend == null || augend == null) {
            throw new IllegalArgumentException("Operands can't be null");
        }

        try {
            System.out.println("Sum is: " + (addend + augend));

        } catch(Exception e) {
            throw new RuntimeException("Addition failed");
        }
    }
}
