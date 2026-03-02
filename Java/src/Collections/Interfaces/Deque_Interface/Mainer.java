package Collections.Interfaces.Deque_Interface;

import java.util.*;

class Dequer {
    public static void asFifo() {
        Deque<String> deque = new ArrayDeque<>();

        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addLast("D");

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
    }
}
public class Mainer {
    public static void main(String[] args) {
        Dequer.asFifo();
    }
}
