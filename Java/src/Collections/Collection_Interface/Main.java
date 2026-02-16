/**
 *                    Notes on Collection Interface
 *
 *                    - It is the foundation upon which the Collections Framework is Built because it must be implemented
 *                       by any class that defines a collection.
 *                    - Collection extends the Iterable ~ This means that all collections can be cycled through by use of
 *                      the for-each style for loop. NB. Only classes that implement Iterable can be cycled though by for
 *
 *                    Collection<E> - The Core Contract
 *                     public interface Collection<E> extends Iterable<E>
 *
 *                     ~ This interface defines what it means to be a collection in Java
 *                     ~ It does not define Ordering, Indexing, Key/value semantics ~ These are added by subinterfaces.
 *
 *                     Categories of Methods in Collection
 *
 *                     ~ Query Operations
 *                        int size() - Number of elements
 *                        boolean isEmpty - Checks if empty, prefer it.
 *                        boolean contains(Object o) - Checks if contains, reliers on equals, if equals is broken - contains() breaks.
 *                        Iterator<E> iterator() - Returns a fail-fast iterator. if collection is structurally modified
 *                        outside iterator --> ConcurrentModificationException
 *
 *                     ~ Modification operations
 *                       boolean add(E e) - Returns true if collection changed false otherwise (E.g Set duplicate)
 *                       boolean remove(Object o) - Removes first matching element (if any). Uses equals)
 *
 *                     ~ Bulk operations
 *                       boolean addAll(Collection<? extends E> c) - adds all elements, Use wildcard for covariance. May
 *                        throw UnsupportedOperationException
 *                       boolean removeAll(Collection<?> c) - Removes all elements present in c
 *                       boolean retainAll(Collection<?> c) - Keeps only elements present in c. Used for: Set intersection
 *                        logic
 *                       void clear() - Removes all elements. In GC terms: Clears references, Object become eligible for GC
 *
 *                     ~ Iteration operations
 *                       Object[] toArray() - Object[] arr = collection.toArray() -- Returns New array, Not backed by collection
 *                       <T> T[] toArray(T[] A) - String[] arr =  list.toArray(new String[0])
 *                          - Preferred modern approach
 *                          - Preserves runtime type
 *
 *                     ~ Equality & Hashing
 *                       boolean equals(Object o) - Defined in Collection contract
 *                          Two collections are equal if:
 *                              - Same size
 *                              - Same elements in same order (for ordered collections)
 *                        int hashCode()
 *                          Based on contained elements
 *                          This is why:
 *                           Mutable collections as keys = dangerous
 *
 *                     ~ Default methods ( Java 8+ )
 *                       These came with Lambdas & Streams.
 *                          boolean removeIf(Predicate<? super E> filter) - Internally Iterates, calls iterator.remove()
 *                           It's not Thread-safe, Fail-fast - Yes
 *                          Spliterator<E> spliterator()
 *                           Used by: Streams, Parallel streams, Allows splitting for parallelism
 *                          Stream<E> stream()
 *                           collection.stream() - Sequential processing
 *                          Stream<E> parallelStream()
 *                            Uses: ForkJoinPool, Spliterator. Parallel execution(not always faster)
 *
 *                     ~ UnsupportedOperationException
 *                       Some collections are read-only
 *
 *                     ~ Fail-Fast Iterators:
 *                       Iterator detects: Structural modification Via modCount field
 *
 *                     ~ Collection vs Iterable:
 *                       Iterable only provides - iterator()
 *                       Collection adds: Size, Mutation, Bulk operations
 *
 *                     Engineering-Level Rules
 *                      - Choose implementation based on access patterns
 *                      - equals() & hashCode() correctness is critical
 *                      - Avoid modifying while iterating
 *                      - Prefer immutable collections when possible
 *                      - Avoid using collections as map keys
 *
 *                      Mental Model
 *                        Collection defines behavior, not storage
 *
 *                        It answers: Can I add? Can I remove? Can I iterate? Can I compare?
 *                        Not: How it's stored, How fast it is(that's implementation-specific)
 *
 */

