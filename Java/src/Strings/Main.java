package Strings;

/**
 *                Notes on Strings
 *
 *                - Strings can be created using, String literals, Character array, StringBuffer, StringBuilder
 *                - Strings are objects in Java
 *                - String, StringBuffer, StringBuilder classes are all defined in the java.lang package and are declared
 *                  as final meaning you can't subclass them.
 *                - They implement CharacterSequence interface
 *                - A String literal is created for every string literal
 */
public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(20, 40);
        System.out.println(); // calls method toString automatically

        String name = " !John  ";
        String name2 = "ohnJ";

        System.out.println(name.codePointCount(2, 3));
    }
};

class Tester {
    int width, height;

    Tester(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return "The rectangle is of width: " + width + " " + "and height: " + height;
    }
}