package Enume_AutoBoxing_Annotations;

/**
 *             Notes on Annotations
 *
 *             1. They add metadata to code. They don't change the logic
 *             2. They are directly used by the compilers, Frameworks(Spring), Runtime Reflection
 *             3. They are created through a mechanism based on the interface.
 *             4. All annotations types automatically extend the Annotations interface thus
 *                Annotation is a super-interface of all annotations.
 *             5. It also specifies annotationType() which returns Class object that represents the invoking annotation.
 *             6. NB - Even an annotation can be annotated
 *
 *             Annotation Retention Policies
 *
 *             - A Retention policy determines at what point an annotation is discarded
 *             - Java defines three polices which are encapsulated within the java.lang.annotation.RetentionPolicy
 *               enumeration.
 *             - They are, SOURCE, CLASS, RUNTIME REFLECTION
 *             - With SOURCE, an annotation is retained only in the source file and is discarded during compilation
 *             - With CLASS, an annotation is store in the .class file during compilation, However it is not available
 *               through the JVM during run time.
 *             - With RUNTIME, is stored in the .class file during compilation and is available through the JVM during run
 *               time. It offers the greatest annotation persistence
 */

// creating your own custom annotations
@interface MyAnno {
    // Java implements these methods, no need to specify their bodies
    // These methods act more like fields

    String str();
    int val();
}

class Worker3 {

    @MyAnno(str = "Annotation Example", val = 1000)
    static void job() {

    }
}

public class Annotations {
    public static void main(String[] args) {
        System.out.println("Hello Annotations");
    }
}
