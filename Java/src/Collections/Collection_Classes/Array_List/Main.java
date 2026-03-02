package Collections.Collection_Classes.Array_List;

import java.util.*;

class Lister {
    static void displayer() {
        List<String> list = new LinkedList<>();
        list = new ArrayList<>();  // they both share the same interface - data type if you like

        List<String> names = List.of("John", "Peter", "Kamau"); // this is unmodiffieble
        List<Integer> nums = Collections.unmodifiableList(Arrays.asList(10 ,20, 40, 50)); // Also unmodifiable

        List<String> users = new ArrayList<>(names); // modifiable -
    }

    static void demo() {
        List<String> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Java mastery");
    }
}
