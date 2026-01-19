package Enume_AutoBoxing_Annotations;

/**
 *              Notes on Auto-Boxing
 *
 *              Java provides type wrappers, which are classes that encapsulate(Box) a primitive type withing an object
 *
 *              1. Boxing - This is where a primitive type is converted to an object(of its equvalence) using its
 *                  wrapper class
 *              2. Un-Boxing - Conversion of an object to it's primitive type
 *              3. AutoBoxing - is the process by which a primitive type is automatically encapsulated (boxed)
 *                 into its equivalent type wrapper whenever an object of tha type is needed
 */


class Worker2 {
    static void job() {

        int number = 200;

        Integer num = new Integer(number); // this has been deprecated since java 9


        // new way
        Integer nu = Integer.valueOf(number);

        // Auto Boxing
        Integer main = number;

        System.out.println(main.byteValue());
    }
}
public class Boxing {
    public static void main(String[] args) {
        Worker2.job();
    }
}
