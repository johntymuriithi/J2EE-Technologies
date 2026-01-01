package Classes;


/**
 *                Notes on classes:
 *                1. Classes defines the shape and the nature of objects
 *                2. Members of these classes are instance variables and the methods.
 *                3. Instance variables because each instance of the object contains its own unique instance var
 *                4. We can say in simple terms that classes defines new data types ~ class name it's self;
 *                5. The new keyword dynamically allocates memory for an object
 *                6. class-var = new classname(); ~ class name followed by the parenthesis specifies the constructor for
 *                the class;
 *                7. Constructors specifies what occurs when the objects of a class are created;
 *                8. A method is always invoked relative to some object of its class
 * means that methods normally operate on an object’s data, and you call them using an object reference.
 *                9. Instance variables	should be accessed only
 * through	methods	defined	by their class
 *                10.
 *
 */
public class Main {
    public static void main(String[] args) {
        Box box = new Box(10, 3, 20);
        Box box1 = new Box(30, 3, 10);

        System.out.println(box.volume());
        System.out.println(box1.volume());
    }
}

class Box {
    double width;
    double height;
    double depth;

    // this is an explicit-declared constructor
    Box(double height, double width, double depth) {
        this.height = height;   // height = height; ~ this will cause instance variable hiding
        this.width = width;
        this.depth = depth;
    }

    double volume() {
        return height * width * depth;
    }
}
