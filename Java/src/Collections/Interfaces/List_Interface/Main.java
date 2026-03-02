package Collections.Interfaces.List_Interface;

/**
 *             Notes on the List Interface
 *
 *             public interface<E> extends Collection<E>
 *
 *             A List is:
 *                 An ordered, index-based, duplicate-allowing collection (these are its feartures)
 *
 *             The Equality Contract of List
 *
 *               - Two Lists are equal if:
 *                   ~ They are same size
 *                   ~ Corresponding elements are equal
 *                   ~ Order matches
 *               - List equality is sequence equality, not mathematical set equality
 *
 *             List Iterators (Stronger than Collection Iterator)
 *              List adds:  ListIterator<E> listIterator();
 *                          ListIterator<E> listIterator(int index);
 *              Unlike normal Iterator, this allows:
 *                 ~ Bi-directional traversal
 *                 ~ Element replacement
 *                 ~ Safe insertion during iteration (Avoids fail-fast issues)
 *
 *             Structural Modification Definition
 *               A structural modification is:
 *                 Any operation that changes size or disrupts iteration order
 *                    e.g add(), remove(), clear()
 *               Not Structural: set(index, element) - coz fail-fast detection depends on this.
 *
 *            Modern Factory Methods (Java 9+)
 *              List.of()...List.copyOf()...  These return immutable lists.
 *              List.copyOf(existingList) -- If input is already immutable --> may return same instance
 *              Optimization detail
 *
 *            SubList
 *            List<String> list = new ArrayList(List.of("A", "B"));
 *            List<String> list2 = list.subList(1, 3);
 *
 *              ~ this does NOT create a new list
 *              ~ It creates a view backed by original list
 *                so list2.remove(0) modifies original list
 *                And
 *                  If you structurally modify parent list outside sublist You get ConcurrentModificationException
 *                  Always defensive copy if needed
 *
 *            Internal Implementations that Matter
 *              Common Implementations:
 *                ArrayList
 *                LinkedList
 *                CopyOnWriteArrayList
 *                ImmutableCollections (from List.of)
 *
 *             Each obeys List contract but behaves differently under, Concurrency, Iteration, Modification cost, Memory
 *
 *           List and Concurrency
 *             List itself is NOT thread-safe.
 *              wrap it in: Collections.synchronizedList(new ArrayList<>());
 *              or use CopyOnWriteArrayList
 *
 *
 *           The List Contract is built on: Sequence semantics, not Mathematical collection semantics
 *             That is why:
 *                equals() is order-sensitive
 *                hashcode() os order-sensitive
 *                iteration order is guaranteed
 */