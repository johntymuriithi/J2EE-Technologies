package Enume_AutoBoxing_Annotations;

/**
 *            Notes on Enums
 *
 *            1. You can have Constructors, Methods and Constants / fields in an enum
 *            2. You can call values() inside an enum - returns list of constant enums
 *            3. constant enumerations are implicitly public, final, static
 *            4. Their types (constants) is the type of enumeration in which they are declared hence
 *               they are sometimes called "self-typed" in which self refers to the type of enclosing enumeration
 *            5. In java, each enum value is an object and enum is a special kind of class
 *            6. Two enumeration constants can be compared for equality by using the == relational operator
 */
enum Names {
    JOHN, PETER, BEATRICE, PATRICK, ERASTUS; // these are called enumerations constants

    // let try calling values() inside here
    private static final Names[] CACHED_VALUES = values();

    public static Names[] getCachedNames() {
        return CACHED_VALUES;
    }
}

class Worker {
    static void work() {
        Names[] names = Names.values(); // How can I turn this space-complexity from O(1) to nothing;

        // Big-O of this is O(n)
        for (Names name : Names.getCachedNames()) {
            System.out.println(name);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Worker.work();
    }
}
