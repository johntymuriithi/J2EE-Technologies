package Generics;

/**
 *                           Note on Generics
 *
 *                           - Think of Generics as a contract: "I promise to only put this type in here"
 *                           - Java enforces that promise at compile time.
 *                           - Can you use multiple types. Gen<K, V)
 *                           - There is also Bounded Generics.    Box<T extends Number>.
 *
 *                               Parameterized Type.
 *
 *                               - It is a class or interface with a type parameter filled in
 *                               - A Generic type where we have specified the actual type
 *                               - List<String> = Parameterized type(real usage)
 *                               - List<T> = Generic definition
 *
 *                               NB Raw types turn off generics and should be avoided e.g List list
 *
 * @param <T>
 */

class Gen<T> {
    T ob;  // declare an object of type T

    // Pass the constructor a reference to an object of type T;
    Gen(T o) {
        ob = o;
    }

    // Return ob
    T getOb() {
        return ob;
    }

    // show type of ob
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Gen<Integer> iob;

        iob = new Gen<Integer>(88);

        iob.showType();

        // Get the value in iob. Notice that no cast is needed
        int v = iob.getOb();
        System.out.println("value: " + v);

        System.out.println();

        //Create a Gen object for strings.
        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();

        String  str = strOb.getOb();
        System.out.println("value: " + str);

        // === Generic Types differs based on their type arguments
        // === Cant use primitive types like int in Generics, only Reference Types (Wrapper Classes)
    }
}
