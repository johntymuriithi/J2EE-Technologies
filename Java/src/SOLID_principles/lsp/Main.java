package SOLID_principles.lsp;

class Bird {
    void fly() {
        System.out.println("I can fly");
    }
}

class Penguin extends Bird {

    @Override
    void fly() {
        throw new UnsupportedOperationException("I can't fly....");
    }

}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Penguin();

        bird.fly();
    }
}
