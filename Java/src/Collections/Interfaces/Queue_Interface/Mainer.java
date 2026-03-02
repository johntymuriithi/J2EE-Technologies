package Collections.Interfaces.Queue_Interface;

import java.util.*;

class Queuer {
    public static void queueBasic() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("John");
        queue.offer("Kamau");
        queue.offer("Peterson");

        System.out.println(queue.poll());
    }

    // For better performance, prefer ArrayDeque :: No extra node objects, Better memory layout
    // Faster than LinkedList, No capacity limit (resizes)

    public static void queueBetter() {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    // PriorityQueue processes based on priority, not insertion order

    public static void queuePriority() {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(50);
        queue.offer(10);
        queue.offer(30);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
public class Mainer {
    public static void main(String[] args) {
        Queuer.queuePriority();
    }
}
