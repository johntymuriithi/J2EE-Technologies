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
    public static void main(String[] args) throws java.io.IOException {
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
//        System.out.println((d));  // here we expect d to be 20
        /**
         * d = c
         * c = c + 1
         */

//        ========================================================
        boolean truly = false;
        boolean falsy = true;
        int num = 10;
        int denom = 11;

//        System.out.println(truly && falsy); // evaluates the right-hand operand only when the left hand operand is false

        if	(denom	!=	0	&&	num	/	denom	>	10)
        {
            System.out.println("Funny Boy");
        }
        // =========================================
        // Iteration Operators in java
        int number = 20;
        int number2 = 21;
        while (number > number2); // Empty-body (null) loops

        int[] numbers = {2, 3, 4, 5, 20};
        int target = 5;
        int i;

        for (i = 0; i < numbers.length && numbers[i] != target; i++);
//        System.out.println(i);

        // do-while
        char choice;
        do {
            System.out.println("Select No of Ur CHoice");
            System.out.println("1:");
            System.out.println("2:");
            System.out.println("3:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '4');
    }
}
