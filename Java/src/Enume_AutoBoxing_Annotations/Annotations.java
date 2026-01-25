package Enume_AutoBoxing_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
 *             - They are, SOURCE, CLASS, RUNTIME
 *             - With SOURCE, an annotation is retained only in the source file and is discarded during compilation
 *                Used for Compiler hints, Code Analysis tools, Documentation tools
 *
 *             - With CLASS, an annotation is store in the .class file during compilation, However it is not available
 *               through the JVM during run time. Used for Bytecode tools, Build-time processing, Framework preprocessing
 *
 *             - With RUNTIME, is stored in the .class file during compilation and is available through the JVM during run
 *               time. It offers the greatest annotation persistence
 *             - If retention policy is not defined, then default policy of CLASS is used
 *
 *             @Target
 *
 *             - This answers where is this annotation allowed to be used
 *
 *             @Inherited
 *
 *             By default, annotations are not inherited by subclasses, this annotation changes that
 *
 *             - Tells Java, "If a class is annotated, its subclasses should inherit this annotation automatically"
 *             - It works on class-level annotations (ElementType.TYPE), and only works with RUNTIME retention
 *
 *             - This is how spring auto-detects beans (Re-usable components)
 *
 *             @Repeatable
 *
 *             It allows the same annotation to be used multiple times on the same element
 *
 *             - Create the container annotation, Create repeatable annotation, Use it multiple times
 *
 *             - Use mostly for security and validation. To Any Target
 *
 *             @PreAuthorize("hasRole('ADMIN')")
 *             @PreAuthorize("hasRole('FINANCE')")
 *
 *             ==================------------------------==============
 *             Single-Member Annotations
 *
 *             - A single-member annotation is an annotation that has exactly one element, and that element is named:
 *
 *             :- Think of annotations as compile-time configuration files written in Java syntax.
 *
 *
 */

// creating your own custom annotations
@interface MyAnno {
    // Java implements these methods, no need to specify their bodies
    // These methods act more like fields

    String str();
    int val();
}

// this is a marker annotation ~ Marking this item
@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@interface AdminOnly {};

class Worker3 {



    @MyAnno(str = "Annotation Example", val = 1000)
    static void job() {

        @AdminOnly
        String password;
    }
}

public class Annotations {
    public static void main(String[] args) {
        System.out.println("Hello Annotations");
    }
}
