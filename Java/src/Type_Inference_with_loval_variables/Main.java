package Type_Inference_with_loval_variables;

import java.lang.reflect.Array;

/**
 *          Some Notes
 *          :: All variables in java must be declared before use
 *          :: Variables can be initialized when they are declared
 *          :: The type of the initializer must be the same (convertable to) the type if the variable declared
 *
 *          1. To use local variable type inference, must declare ur variable with var - a reserved type name;
 *
 *          :: var is context-sensitive identifier
 *           >> Thus,	in	a	local	variable declaration, var is a placeholder	for	the	actual,	inferred	type.
 *
 *           2. Can not use var to declare classes
 *
 *           3. var	can	be	used	to	declare	a	variable	only when	that	variable	is	initialized
 *              var number; // wrong
 *           4. remember	that	var	can	be	used	only	to	declare	local	variables.	It	cannot
 *  be	used	when	declaring	instance	variables,	parameters,	or	return	types,	for
 *  example.
 *           5. 	Only	one	variable	can	be	declared	at	a	time;
 *  a	variable	cannot	use	null	as	an	initializer;	and	the	variable	being	declared
 *  cannot	be	used	by	the	initializer	expression.	Although	you	can	declare	an	array
 *  type	using	var,	you	cannot	use	var	with	an	array	initializer.
 *
 *
 */
class Main {
    public static void main(String[] args) {
        // before
        double numberBefore = 45.0;

        // after (with type inference)
        var number = 45.0;

        System.out.println(((Object) number).getClass().getSimpleName());
        /**
         * Why we cast to Object
         * Because var is resolved at compile time.
         * number is a primitive double, but Java autoboxes it into Double when cast to Object.
         */

        // NB When used in other places, var is just but fellow user-defined identifiers

        int var = 45;
        System.out.println(((Object) var).getClass().getSimpleName());  // will print Integer not Double wrapper class

        // with arrays
        var myArray = new int[20]; // myArray inferred as int[]

        // var[]	myArray	=	new	int[10];	//	Wrong
        // var	myArray[]	=	new	int[10];	//	Wrong
    }
}