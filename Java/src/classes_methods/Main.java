package classes_methods;

class Outer {

    Outer() {
        System.out.println(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
    }
}
