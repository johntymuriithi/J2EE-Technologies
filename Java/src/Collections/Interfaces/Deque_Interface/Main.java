package Collections.Interfaces.Deque_Interface;

/**
 *         Notes on Deque
 *
 *         Deque = Double-Ended Queue
 *
 *         - It allows: Insert at front, back, Remove from front, back
 *         - So it can behave like Queue(FIFO), Stack(LIFO) or Both at the same time
 *         - It replaces Stack, LinkedList, and basic Queue
 *         - In modern Java, if you need a stack or queue --> use ArrayDeque
 *
 *         Core Methods
 *
 *         addfirst(), addLast(), offerFirst(), offerLast()
 *         removeFirst(), removeLast(), pollFirst(), pollLast()
 *         getFirst(), getLast(), peekFirst(), peekLast()
 *
 *         For Implementation, use ArrayDeque coz:
 *                                            Backed by resizable array
 *                                            No node allocation like LinkedList
 *                                            Better cache locality
 *                                            Faster
 *                                            No synchronization overhead
 *         Avoid LinkedList Unless you truly need list behavior
 *
 *
 */
public class Main {
}
