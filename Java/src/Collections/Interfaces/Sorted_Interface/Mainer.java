package Collections.Interfaces.Sorted_Interface;

import java.time.LocalDateTime;
import java.util.*;

public class Mainer {
    public static void main(String[] args) {
//        Natural Ordering Example
        SortedSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(30);
        set.add(20);

//        Because Integer implements Comparable.

        System.out.println(set); // [10, 20, 30]

//       Custom Ordering Example
       SortedSet<String> set1 = new TreeSet<>(Comparator.reverseOrder());
       set1.add("A");
       set1.add("Z");
       set1.add("C");

        System.out.println(set.tailSet(20));

        SortedSet<LocalDateTime> timestamps = new TreeSet<>();
        LocalDateTime now = LocalDateTime.now();

        System.out.println(timestamps.tailSet(now.minusHours(6)));
    }
}
