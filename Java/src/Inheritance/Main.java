package Inheritance;

/**
 *                 - Inheritance is basically heirarchical Classification
 *                 - A class (subclass) inherits members from the superclass
 *                 - Use extend keyword followed by the superclass
 *                 -
 */

abstract class Animal {
    String gender;

    abstract void display();
}

class Dog extends Animal {
    String color;

    Dog(String g, String c) {
        this.gender = g;
        this.color = c;
    }

    void display() {
        System.out.println("My dog is of color " + color + " and is a " + gender);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Male", "Red");
        Animal animal;
        dog.display();
    }
}
