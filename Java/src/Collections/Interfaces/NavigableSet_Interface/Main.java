package Collections.Interfaces.NavigableSet_Interface;

/**
 *         Notes on Navigable Set
 *
 *         -If Set gives uniqueness, and SortedSet gives ordering, This gives precise navigation through elements + ordering
 *            public interface NavigableSet<E> extends SortedSet<E>
 *                “Give me the closest element less than this.”
 *
 *         Main Implementation: TreeSet
 *          NavigableSet<Integer> set = new TreeSet<>();
 *          TreeSet implements NavigableSet using a Red-Black Tree
 *
 *         ~ NavigableSet is strictly more powerful than SortedSet
 *         ~ Ordered set + precise navigation + range querying
 *         ~ NavigableSet = In-memory database index
 *         ~ A balanced search tree exposed as a high-level API, This gives you database-like capabilities in memory.
 *
 */
