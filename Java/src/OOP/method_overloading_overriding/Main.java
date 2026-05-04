package OOP.method_overloading_overriding;

class A {
    void print(String s) {
        System.out.println("Object");
    }
}

class B extends A {
    void print(String s) {
        System.out.print("String here");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();

        a.print("Hello");
    }
}
