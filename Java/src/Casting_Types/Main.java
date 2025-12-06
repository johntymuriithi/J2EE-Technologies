package Casting_Types;

/*
     Special Notes on Casting;

     1. Java automatically promotes bytes, short and char in an expression to int.
     2. In any expression, if one of the operand is a long, then the whole expression is promoted to long.
     3. In any expression, if one of the operand is a float, then the whole expression is promoted to float.
     4. In any expression, if one of the operand is a double, then the whole expression is promoted to double.

     Automatic Conversions Conditions (Widening Conversion);

     1. The two types must be compatible with each other.
     2. The destination type must be greater than the source type.

     > int is compatible with long
     > numeric types are compatible with each other.
     > No automatic conversion from numeric to char, boolean or char

     Explicit Type Conversion (Type Casting)

     (target-type) value

     1. If the Integer value is greater than the bytes range, it will be reduced to modulo ( remainder of the int
     with the bytes range(256))
     2. When floating-point value is assigned to an integer types, it's fractional component is lost.
     3. If the size of the whole number component is too large to fit into the target integer type, then that value
     will be reduced modulo the target type's range.

 */

public class Main {
    public static void main(String[] args) {
        byte byter = 1;
        byte by = 120;

        int num = 300;

        byte num_tester = (byte) num;

        System.out.println(num_tester);

        byte total = (byte) (by * byter);
    }
}