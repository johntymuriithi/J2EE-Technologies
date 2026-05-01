package OOP.challenge2;

public class Main {
    public static void main(String[] args) {
        // this is called subtype polymorphism e.i RetryCalculations is a Calculations
        Calculations calculations = new RetryCalculations(new AdditionLogic());   // Enables polymorphism (IS-A)
        calculations.add(30, 50);

        // Core rule: A variable of type Calculations can only reference objects that implement or extends Calculations

        // IS-A and HAS-A, together they form the Decorator Pattern
        // “We implement the interface to stay substitutable, and use composition to reuse and extend behavior.”

        // Implements Enables substitution (Liskov Substitution Principle)
    }
}
