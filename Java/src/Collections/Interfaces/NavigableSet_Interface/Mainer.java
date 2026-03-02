package Collections.Interfaces.NavigableSet_Interface;

import java.util.*;

/**
 *     Exposing Navigable Set Interface
 *
 */
public class Mainer {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>(List.of(10, 20, 30, 40));

        System.out.println("Original: " + set);
        System.out.println();
        System.out.println("Lower: " + set.lower(25));
        System.out.println("Floor: " + set.floor(20));
        System.out.println("Ceiling: " + set.ceiling(25));
        System.out.println("Higher: " + set.higher(30));
    }
}
