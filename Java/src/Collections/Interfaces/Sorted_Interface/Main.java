package Collections.Interfaces.Sorted_Interface;

/**
 *               Notes on Sorted Set
 *
 *               ~ SortedSet is where Set stops being just about uniqueness and starts enforcing total ordering.
 *                 public interface SortedSet<E> extends Set<E>
 *               ~ It adds one core guarantee:
 *                   Elements are maintained in ascending sorted order
 *               ~ Unlike HashSet: Order is undefined.
 *                 Unlike LinkedHashSet:
 *                    Order is insertion-based
 *                 SortedSet: Order is determined by comparison
 *
 *               What Does "Sorted" Mean Here?
 *                Sorted according to either: Natural ordering (Comparable), Custom ordering (Comparator)
 *
 *               ~ SortedSet is usually implemented by TreeSet which internally uses TreeMap which is A Red-Black Tree
 *                 (self-balancing BST)
 *
 *                 Performance Characteristics
 *                  ~ All operations are O(log n) - Logarithmic coz tree height is log(n)
 *
 *                 TreeSet does not allow null (Java 7+) because Comparator cannot compare null safely in natural ordering
 *                 HashSet allows one null, TreeSet does not.
 *
 *                 SortedSet is ideal for:
 *                        - Ranking systems  - Priority windows
 *                        - Range queries
 *                        - Leaderboards
 *                        - Time-based ordering
 *                        - Time-based ordering
 *
 *
 *
 *
 */
