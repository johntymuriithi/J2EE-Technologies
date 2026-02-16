package LamdaExpressions;

import java.lang.annotation.Retention;

/**
 *              Notes on Lambda Expressions
 *
 *              - LE is a short way to represent a function without a name
 *              - In java, lambdas are used to implement functional interfaces (interface that has only one abstract method)
 *
 *              When not to use Lambdas
 *                 - Complex logic, Too many lines, When readability suffers
 *                 : Closure - Is a function that captures variables from its surrounding scope
 *
 *                 : A lambda or method reference has NO type on its own.
 *                    Its type comes entirely from where it is used.
 *
 *                    : The target type is the functional interface the compiler expects.
 *                    : Target typing is the compiler’s ability to infer the type of a lambda or method reference from its surrounding context.
 *                    : A constructor reference is just a lambda that calls new, and the functional interface decides which constructor is used.
 */

interface MyFunc<T> {
    Jonte<T> func(T n);
}

class Jonte<T> {
    private T val;

    Jonte (T v) {
        val = v;
    }

    Jonte() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

public class Main {
    public static void main(String[] args) {
        MyFunc<Integer> myFunc = Jonte<Integer>::new;

        Jonte<Integer> jonte = myFunc.func(100);

        System.out.println(jonte.getVal());
    }
}
