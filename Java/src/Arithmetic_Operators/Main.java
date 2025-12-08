package Arithmetic_Operators;

/**
 *         Notes on Arithmetic Operators
 *
 *         1. Any operator of the form: var = var op expression can be var op= expression
 *         2. Bitwise operators act upon the individual bits of their operands ~ they manipulate the bits within integers
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        // compound operators
        int num1 = 23;
        num1 += num1 + 1;
//        System.out.println(num1);

        // Increment, Decrement operators;
        int a = 20;
        int b = ++a;
//        System.out.println(b);  // here we expect b to be 21
        /**
         * a = a + 1
         * b = a
         */

        int c = 20;
        int d = c--;
        System.out.println(d);  // here we expect d to be 20
        /**
         * d = c
         * c = c + 1
         */
    }
}
